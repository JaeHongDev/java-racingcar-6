package racingcar.model;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import racingcar.model.TrackPerResultModel.Participant;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("트랙별 이동 결과 모델")
class TrackPerResultModelTest {


    @Test
    void 사용자_결과를_표현할_수_있다() {
        final var participants = List.of(
                new Participant("사용자1", 5),
                new Participant("사용자2", 1)
        );
        final var expected = """
                사용자1 : -----
                사용자2 : -
                """;
        final var model = new TrackPerResultModel(participants);

        Assertions.assertThat(model.toResult()).isEqualTo(expected);


    }

}