package racingcar.event.part;

import racingcar.event.EventContext;
import racingcar.event.EventListener.ParameterEvent;

public record InitializeParticipantsEvent(EventContext eventContext) implements ParameterEvent<String> {
    @Override
    public void execute(String input) {

    }
}
