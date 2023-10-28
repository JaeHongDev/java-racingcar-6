package racingcar.view.core;

import camp.nextstep.edu.missionutils.Console;

public final class InputView extends ConsoleWriter {


    public String readParticipantsName() {
        this.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public Integer readTrackSize() {
        this.println("시도할 회수는 몇회인가요?");
        try {
            return Integer.parseInt(Console.readLine());
        } catch (Exception exception) {
            throw new IllegalArgumentException("정수만 입력 가능합니다.");
        }
    }

}
