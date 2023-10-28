package racingcar.view;

import racingcar.event.EventContext;
import racingcar.event.EventListener;
import racingcar.view.core.InputView;
import racingcar.view.core.ViewContainer;

/**
 * 전체 뷰를 실행시키는 MainView입니다.
 */
public class MainView {
    public static void open() {
        new ViewContainer(
                new InputView(),
                new EventListener(new EventContext())
        ).executeAllViews();
    }

}
