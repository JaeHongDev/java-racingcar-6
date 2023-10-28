package racingcar.view.core;

import racingcar.view.part.RaceGameView.GameResultViewModel;

public final class OutputView extends ConsoleWriter {


    public void printRacingResult(GameResultViewModel gameResultViewModel) {
        this.println(gameResultViewModel.getResult());
        this.println("");
    }

    public void printRacingResultMessage() {
        this.println("실행 결과");
    }

    public void printWinner() {
        this.println("최종 우승자");
    }
}
