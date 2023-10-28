package racingcar.factory;

import java.util.List;
import racingcar.domain.Participant;

public interface GenerateParticipantsFactory {
    List<Participant> generate();
}
