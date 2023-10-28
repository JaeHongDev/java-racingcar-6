package racingcar.view.part;

import static org.mockito.ArgumentMatchers.any;

import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import racingcar.event.EventListener;
import racingcar.event.part.RaceTrackEvent.RaceStatus;
import racingcar.event.part.RaceTrackEvent.TrackResult;
import racingcar.view.core.OutputView;

class RaceGameViewTest {


    @Test
    void test() {

        final var eventListener = Mockito.mock(EventListener.class);

        BDDMockito.given(eventListener.listenWithResult(any())).willReturn(
                new TrackResult(RaceStatus.INCOMPLETE, Map.of("b", 2, "c", 5)),
                new TrackResult(RaceStatus.INCOMPLETE, Map.of("a", 3, "c", 10)),
                new TrackResult(RaceStatus.COMPLETED, Map.of())

        );

        new RaceGameView(new OutputView(), eventListener).open();
    }

}