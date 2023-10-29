package racingcar.viewmodel;

import racingcar.event.EventListener;
import racingcar.event.part.FindWinnerEvent;
import racingcar.model.RaceWinnerModel;
import racingcar.view.core.OutputView;
import racingcar.view.core.ViewModel;

public record WinnerViewModel(OutputView outputView, EventListener eventListener) implements ViewModel {
    @Override
    public void execute() {
        outputView.printWinner(new RaceWinnerModel(eventListener.listenWithResult(FindWinnerEvent::new)));
    }
}
