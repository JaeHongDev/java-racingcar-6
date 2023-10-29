package racingcar.event.part;

import java.util.List;
import racingcar.event.EventContext;
import racingcar.event.EventListener.ReturnEvent;

public record FindWinnerEvent(EventContext eventContext) implements ReturnEvent<List<String>> {

    @Override
    public List<String> execute() {
        
        return null;
    }
}
