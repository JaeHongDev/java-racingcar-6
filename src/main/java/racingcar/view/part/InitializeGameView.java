package racingcar.view.part;

import racingcar.event.EventListener;
import racingcar.event.part.InitializeParticipantsEvent;
import racingcar.event.part.InitializeTrackCountEvent;
import racingcar.view.core.InputView;
import racingcar.view.core.ViewContainer.DefaultView;

public record InitializeGameView(InputView inputView, EventListener eventListener) implements DefaultView {
    @Override
    public void open() {
        eventListener.listenWithParameter(InitializeParticipantsEvent::new)
                .accept(inputView.readParticipants());

        eventListener.listenWithParameter(InitializeTrackCountEvent::new)
                .accept(inputView.readTrackCount());


    }
}
