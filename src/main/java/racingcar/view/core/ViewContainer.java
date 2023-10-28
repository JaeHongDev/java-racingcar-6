package racingcar.view.core;

import java.util.List;
import racingcar.event.EventListener;

public class ViewContainer {
    private final List<ViewModel> viewModels;

    public ViewContainer(InputView inputView, OutputView outputView, EventListener eventListener) {
        this.viewModels = List.of();
    }

    public void executeAllView() {
        this.viewModels.forEach(ViewModel::execute);
    }


}
