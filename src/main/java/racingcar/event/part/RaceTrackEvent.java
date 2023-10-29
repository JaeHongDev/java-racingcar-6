package racingcar.event.part;

import java.util.Map;
import racingcar.event.EventContext;
import racingcar.event.EventListener.ReturnEvent;
import racingcar.event.part.RaceTrackEvent.RaceResult;

public record RaceTrackEvent(EventContext eventContext) implements ReturnEvent<RaceResult> {


    @Override
    public RaceResult execute() {
        return null;
    }

    public record RaceResult(
            boolean complete,
            Map<String, Integer> resultByParticipants
    ) {

        public boolean hasContinue() {
            return !complete;
        }
    }

}
