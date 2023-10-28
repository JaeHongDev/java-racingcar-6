package racingcar.domain;

public record Track(int position) {
    private static final int START_LINE = 0;

    public Track {
        if (position < 0) {
            throw new IllegalArgumentException("트랙은 0보다 작을 수 없습니다.");
        }
    }

    public static Track initializeStartLine() {
        return new Track(START_LINE);
    }

    public Track next() {
        return new Track(position + 1);
    }

    public Track previous() {
        return new Track(position - 1);
    }
}
