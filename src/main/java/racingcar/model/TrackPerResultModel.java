package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public record TrackPerResultModel(
        List<Participant> participants
) {

    public String toResult() {
        return participants.stream()
                .map(Participant::toResult)
                .collect(Collectors.joining("\n"));
    }


    public record Participant(String name, Integer distance) {
        private static final String RESULT_FORMAT = "%s : %s";
        private static final String DISTANCE_UNIT = "-";

        public String toResult() {
            return String.format(RESULT_FORMAT, name, DISTANCE_UNIT.repeat(distance));
        }
    }
}
