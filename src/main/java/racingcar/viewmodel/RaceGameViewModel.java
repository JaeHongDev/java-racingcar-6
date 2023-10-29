package racingcar.viewmodel;

import java.util.Map;
import java.util.stream.Stream;
import racingcar.event.EventListener;
import racingcar.event.part.RaceTrackEvent;
import racingcar.event.part.RaceTrackEvent.RaceResult;
import racingcar.model.TrackPerResultModel;
import racingcar.model.TrackPerResultModel.Participant;
import racingcar.view.core.OutputView;
import racingcar.view.core.ViewModel;

public record RaceGameViewModel(OutputView outputView, EventListener eventListener) implements ViewModel {
    @Override
    public void execute() {
        Stream.generate(() -> eventListener.listenWithResult(RaceTrackEvent::new))
                .takeWhile(RaceResult::hasContinue)
                .map(RaceResult::resultByParticipants)
                .map(Map::entrySet)
                .map(entries -> new TrackPerResultModel(entries.stream().map(entry -> new Participant(entry.getKey(), entry.getValue())).toList()))
                .forEach(outputView::printTrackPerResult);
    }
}
