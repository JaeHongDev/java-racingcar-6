package racingcar.event.part;

import racingcar.event.EventContext;
import racingcar.event.EventListener.ReturnEvent;
import racingcar.event.part.CollectWinnerEvent.Winner;

public record CollectWinnerEvent(EventContext eventContext) implements ReturnEvent<Winner> {

    @Override
    public Winner execute() {
        return null;
    }

    public record Winner() {

    }
}
