package racingcar.exception;

import java.util.function.Supplier;

public enum DomainExceptionCode {
    LAP_MUST_BE_GREATER_THAN_ZERO("LAP은 0보다 작을 수 없습니다."),
    CAR_NAME_CAN_NOT_BE_EMPTY("자동차 이름은 비어 있을 수 없다."),
    CAR_NAME_MUST_BE_LESS_THAN_EQUAL("자동차 이름의 길이는 5이하입니다."),

    EXTRACT_TRACK_MUST_BE_GRATER_THAN_ZERO("LAP은 0보다 작을 수 없습니다."),
    DID_NOT_EXISTS_WINNER("우승자가 존재하지 않습니다.");
    private final String message;

    DomainExceptionCode(String message) {
        this.message = message;
    }


    public DomainException create() {
        return new DomainException(this.message);
    }

    public void dynamicInvoke(Supplier<Boolean> booleanSupplier) {
        if (booleanSupplier.get()) {
            throw new DomainException(this.message);
        }
    }
}