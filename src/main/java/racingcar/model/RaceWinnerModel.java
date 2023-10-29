package racingcar.model;

import java.util.List;

public record RaceWinnerModel(List<String> winnerNames) {

    public String toResult() {
        return String.join(",", winnerNames);
    }

}
