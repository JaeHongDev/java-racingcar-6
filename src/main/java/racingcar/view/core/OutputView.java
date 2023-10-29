package racingcar.view.core;

import racingcar.model.TrackPerResultModel;

public final class OutputView extends ConsoleWriter {
    public void printTrackPerResult(TrackPerResultModel trackPerResultModel) {
        this.println(trackPerResultModel.toResult());
        this.println("");
    }
}
