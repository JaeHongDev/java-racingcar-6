package racingcar.domain;

/**
 * 경주에 참여하는 사람
 */
public class Participant {

    private final Car car;
    private final Track nowTrack;

    public Participant(String name) {
        this.car = new Car(name);
        this.nowTrack = Track.initializeStartLine();
    }

    private Participant(Car car, Track nowTrack) {
        this.car = car;
        this.nowTrack = nowTrack;
    }

    public Participant move(boolean movable) {
        if (movable) {
            return new Participant(car, nowTrack.next());
        }
        return this;
    }
}
