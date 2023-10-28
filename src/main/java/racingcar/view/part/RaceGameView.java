package racingcar.view.part;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import racingcar.event.EventListener;
import racingcar.event.part.RaceTrackEvent;
import racingcar.event.part.RaceTrackEvent.RaceStatus;
import racingcar.event.part.RaceTrackEvent.TrackResult;
import racingcar.view.core.OutputView;
import racingcar.view.core.ViewContainer.DefaultView;

public record RaceGameView(
        OutputView outputView,
        EventListener eventListener
) implements DefaultView {


    @Override
    public void open() {
        this.outputView.printRacingResultMessage();

        Stream.generate(() -> eventListener.listenWithResult(RaceTrackEvent::new))
                .takeWhile(trackResult -> Objects.equals(trackResult.raceStatus(), RaceStatus.INCOMPLETE))
                .map(GameResultViewModel::of)
                .forEach(outputView::printRacingResult);
    }


    public static class GameResultViewModel {
        private final Map<String, Integer> participants;

        private GameResultViewModel(Map<String, Integer> participants) {
            this.participants = participants;
        }

        public static GameResultViewModel of(TrackResult trackResult) {
            return new GameResultViewModel(trackResult.participantLocations());
        }

        public String getResult() {
            return participants.entrySet()
                    .stream().map(entry -> format(entry.getKey(), entry.getValue()))
                    .collect(Collectors.joining("\n"));
        }

        private String format(String name, Integer distance) {
            return String.format("%s : %s", name, "-".repeat(distance));
        }
    }
}
