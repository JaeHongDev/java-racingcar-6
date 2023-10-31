package racingcar.data;

import racingcar.domain.ExtractTrack;
import racingcar.domain.Participants;

public class DataStore {

    private ExtractTrack extractTrack;
    private Participants participants;


    public void saveExtractTrack(ExtractTrack extractTrack) {
        this.extractTrack = extractTrack;
    }

    public void saveParticipants(Participants participants) {
        this.participants = participants;
    }


    public ExtractTrack findExtractTrack() {
        return extractTrack;
    }

    public Participants findParticipants() {
        return participants;
    }

}
