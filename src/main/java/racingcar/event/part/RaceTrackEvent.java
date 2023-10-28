package racingcar.event.part;

import java.util.Map;
import racingcar.event.EventContext;
import racingcar.event.EventListener.ReturnEvent;
import racingcar.event.part.RaceTrackEvent.TrackResult;

public record RaceTrackEvent(EventContext eventContext) implements ReturnEvent<TrackResult> {


    @Override
    public TrackResult execute() {
        return null;
    }

    public enum RaceStatus {
        COMPLETED,
        INCOMPLETE,
    }

    public record TrackResult(
            RaceStatus raceStatus,
            Map<String, Integer> participantLocations
    ) {

    }
}
