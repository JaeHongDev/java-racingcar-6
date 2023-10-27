package racingcar.view.core;


import java.util.List;

/**
 * 사용하는 View에 대한 정보를 가지고 있습니다.
 */
public class ViewContainer {
    private final List<DefaultView> views;

    public ViewContainer() {
        this.views = List.of();
    }

    public void executeAllViews() {
        views.forEach(DefaultView::open);
    }


    @FunctionalInterface
    public interface DefaultView {
        void open();
    }
}
