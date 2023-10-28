package racingcar.domain.validator;

import java.util.function.Consumer;

public class StringLengthValidator {

    public static Consumer<Integer> isLessThan(String input) {
        return (size) -> {
            if (input.length() < size) {
                throw new IllegalArgumentException("");
            }
        };
    }

    interface IllegalArgumentExceptionProvider {
        void throwError(Consumer<String> message);
    }
}
