package racingcar.view.core;


import java.util.List;
import racingcar.event.EventListener;
import racingcar.view.part.InitializeGameView;

/**
 * 사용하는 View에 대한 정보를 가지고 있습니다.
 */
public class ViewContainer {
    private final List<DefaultView> views;

    public ViewContainer(final InputView inputView, EventListener eventListener) {
        this.views = List.of(
                new InitializeGameView(inputView, eventListener)
        );
    }

    public void executeAllViews() {
        views.forEach(DefaultView::open);
    }


    @FunctionalInterface
    public interface DefaultView {
        void open();
    }
}
