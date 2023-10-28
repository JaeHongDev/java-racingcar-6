package racingcar.domain;


import java.util.List;
import racingcar.factory.GenerateParticipantsFactory;
import racingcar.factory.RacingCarMoveStrategy;

/**
 * 참가자 목록
 */
public class Participants {
    private final List<Participant> participants;

    public Participants(GenerateParticipantsFactory generateParticipantsFactory) {
        this.participants = generateParticipantsFactory.generate();
    }

    private Participants(List<Participant> participants) {
        this.participants = participants;
    }


    public Participants move(RacingCarMoveStrategy racingCarMoveStrategy) {
        return new Participants(this.participants.stream()
                .map(participant -> participant.move(racingCarMoveStrategy.move()))
                .toList());
    }
}
