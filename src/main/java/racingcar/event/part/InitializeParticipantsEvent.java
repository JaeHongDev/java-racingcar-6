package racingcar.event.part;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.Participant;
import racingcar.domain.Participants;
import racingcar.event.EventContext;
import racingcar.event.EventListener.ParameterEvent;
import racingcar.factory.GenerateParticipantsFactory;

public record InitializeParticipantsEvent(EventContext eventContext) implements ParameterEvent<String> {
    @Override
    public void execute(String input) {
        final var participants = new Participants(new ParticipantsFactory(input));
        eventContext.saveParticipants(participants);
    }


    static class ParticipantsFactory implements GenerateParticipantsFactory {
        private final String text;

        public ParticipantsFactory(String text) {
            this.text = text;
        }

        @Override
        public List<Participant> generate() {
            return Arrays.stream(text.split(","))
                    .map(Participant::new)
                    .collect(Collectors.toList());
        }
    }
}
