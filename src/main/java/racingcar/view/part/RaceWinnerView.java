package racingcar.view.part;

import racingcar.event.EventListener;
import racingcar.event.part.CollectWinnerEvent;
import racingcar.view.core.OutputView;
import racingcar.view.core.ViewContainer.DefaultView;

public record RaceWinnerView(OutputView outputView, EventListener eventListener) implements DefaultView {
    @Override
    public void open() {
        eventListener.listenWithResult(CollectWinnerEvent::new);
    }
}
