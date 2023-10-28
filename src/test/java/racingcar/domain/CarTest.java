package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CarTest {

    @ParameterizedTest
    @ValueSource(ints = {6, 7, 8, 9})
    void 자동차_이름은_5글자_제한을_가지고_있습니다(int input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car("a".repeat(input)));
    }

}