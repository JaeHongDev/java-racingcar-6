package racingcar.view.part;

import racingcar.event.EventListener;
import racingcar.event.part.InitializeParticipantsEvent;
import racingcar.event.part.InitializeTrackSizeEvent;
import racingcar.view.core.InputView;
import racingcar.view.core.ViewModel;

public record InitializeGameView(InputView inputView, EventListener eventListener) implements ViewModel {

    @Override
    public void execute() {
        eventListener.listenWithParameter(InitializeParticipantsEvent::new).accept(inputView.readParticipantsName());
        eventListener.listenWithParameter(InitializeTrackSizeEvent::new).accept(inputView.readTrackSize());
    }
}
