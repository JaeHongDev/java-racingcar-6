package racingcar.event;

import racingcar.domain.Participants;
import racingcar.domain.Track;

public class EventContext {
    private Participants participants;
    private Track track;

    public Participants saveParticipants(Participants participants) {
        this.participants = participants;
    }

    public Track saveTrackCount(Track track) {
        return this.track = track;
    }

    public Participants getParticipants() {
        return participants;
    }

    public Track getTrack() {
        return track;
    }
}
