package racingcar.domain;

public class Track {
    private static final int START_LINE = 0;
    private final int goal;
    private final int now;


    public Track(int goal) {
        this(goal, START_LINE);
    }

    private Track(int goal, int now) {
        validateTrackSize(goal, now);
        this.goal = goal;
        this.now = now;
    }

    private static void validateTrackSize(int goal, int now) {
        if (goal < START_LINE) {
            throw new IllegalArgumentException("트랙은 0보다 작을 수 없습니다.");
        }
        if (goal < now) {
            throw new IllegalArgumentException("현재 lap이 트랙의 목표보다 클 수 없습니다.");
        }
    }

    public Track nextLap() {
        return new Track(goal, now + 1);
    }

    public boolean isCompleted() {
        return goal == now;
    }
}
