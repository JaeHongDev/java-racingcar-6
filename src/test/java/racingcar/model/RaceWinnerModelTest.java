package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RaceWinnerModelTest {

    @Test
    void 우승자를_출력할_수_있습니다() {
        assertThat(new RaceWinnerModel(List.of("1", "2", "3")).toResult())
                .isEqualTo("1,2,3");

    }

}