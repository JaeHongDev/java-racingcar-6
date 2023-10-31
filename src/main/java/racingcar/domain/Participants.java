package racingcar.domain;

import java.util.List;
import java.util.function.Function;
import racingcar.exception.DomainExceptionCode;
import racingcar.strategy.RacingCarMoveStrategy;

public record Participants(List<Car> cars) {

    public static Participants of(List<String> names) {
        return new Participants(names.stream()
                .map(Car::new)
                .toList()
        );
    }

    public Participants moveAll(RacingCarMoveStrategy racingCarMoveStrategy) {
        return new Participants(this.convert(car -> car.move(racingCarMoveStrategy)));
    }

    public <T> List<T> convert(Function<Car, T> function) {
        return cars.stream()
                .map(function)
                .toList();
    }

    public List<String> collectWinnerNames() {
        final var maxLap = cars.stream()
                .mapToInt(Car::getLap)
                .max()
                .orElseThrow(DomainExceptionCode.DID_NOT_EXISTS_WINNER::create);

        return cars()
                .stream()
                .filter(car -> car.getLap() == maxLap)
                .map(Car::getName)
                .toList();

    }
}
