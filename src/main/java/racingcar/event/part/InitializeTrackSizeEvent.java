package racingcar.event.part;

import racingcar.event.EventContext;
import racingcar.event.EventListener.ParameterEvent;

public record InitializeTrackSizeEvent(EventContext eventContext) implements ParameterEvent<Integer> {
    @Override
    public void execute(Integer input) {

    }
}
