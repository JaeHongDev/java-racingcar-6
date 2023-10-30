package racingcar.view.core;

import racingcar.model.RaceWinnerModel;
import racingcar.model.TrackPerResultModel;

public final class OutputView extends ConsoleWriter {
    public void printTrackPerResult(TrackPerResultModel trackPerResultModel) {
        this.println(trackPerResultModel.toResult());
        this.println("");
    }

    public void printWinner(RaceWinnerModel raceWinnerModel) {
        this.println(raceWinnerModel.toResult());
    }
}
