package racingcar.event.part;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Map;
import racingcar.event.EventContext;
import racingcar.event.EventListener.ReturnEvent;
import racingcar.event.part.RaceTrackEvent.TrackResult;
import racingcar.factory.RacingCarMoveStrategy;

public record RaceTrackEvent(EventContext eventContext) implements ReturnEvent<TrackResult> {


    @Override
    public TrackResult execute() {
        RacingCarMoveStrategy racingCarMoveStrategy = () -> Randoms.pickNumberInRange(0, 9) <= 4;

        final var participants = eventContext.getParticipants();
        final var nowTrack = eventContext.getTrack();

        eventContext.saveParticipants(participants.move(racingCarMoveStrategy));
        eventContext.saveTrackCount(nowTrack.previous());

        if (nowTrack.position() <= 0) {
            return new TrackResult(RaceStatus.COMPLETED, null);
        }
        return new TrackResult(RaceStatus.INCOMPLETE, null);
    }

    public enum RaceStatus {
        COMPLETED,
        INCOMPLETE
    }

    public record TrackResult(
            RaceStatus raceStatus,
            Map<String, Integer> participantLocations
    ) {

    }
}
