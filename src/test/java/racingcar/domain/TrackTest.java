package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("[도메인] 자동차 경주 게임의 트랙은 ")
class TrackTest {


    @Test
    void 트랙에서_목표지점까지_갈_수_있습니다() {
        final var goal = 3;
        final var nowTrack = new Track(goal)
                .nextLap()
                .nextLap()
                .nextLap();

        assertThat(nowTrack.isCompleted()).isTrue();
    }

    @Test
    void 트랙에서_목표지점까지_갈_수_없습니다() {
        final var goal = 3;
        final var nowTrack = new Track(goal).nextLap();

        assertThat(nowTrack.isCompleted()).isFalse();
    }

    @Test
    void 트랙이_목표지점보다_더_멀리_갈_수없습니다() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Track(1)
                        .nextLap()
                        .nextLap());
    }


    @Nested
    @DisplayName(" 생성할 때")
    class CreateTest {

        @ParameterizedTest
        @ValueSource(ints = {-1, -2})
        void _0이하의_숫자를_생성할_수_없습니다(int trackSize) {
            assertThatIllegalArgumentException()
                    .isThrownBy(() -> new Track(trackSize));
        }
    }
}