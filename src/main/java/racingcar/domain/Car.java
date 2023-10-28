package racingcar.domain;

/**
 * 자동차
 */
public record Car(String name) {
    public Car {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 제한입니다.");
        }
    }
}
