package racingcar;

import racingcar.event.EventContext;
import racingcar.event.EventListener;
import racingcar.view.core.InputView;
import racingcar.view.core.OutputView;
import racingcar.view.core.ViewContainer;

public class MainView {

    public void open() {
        new ViewContainer(new InputView(),
                new OutputView(),
                new EventListener(new EventContext())
        ).executeAllView();


    }
}
