package racingcar.viewmodel;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import java.util.Map;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import racingcar.event.EventListener;
import racingcar.event.part.RaceTrackEvent.RaceResult;
import racingcar.view.core.OutputView;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RaceGameViewModelTest {

    @Test
    void 출력결과가_정상적으로_나오는지() {
        final var eventListener = Mockito.mock(EventListener.class);

        given(eventListener.listenWithResult(any())).willReturn(
                new RaceResult(false, Map.of("a", 4, "b", 5)),
                new RaceResult(false, Map.of("a", 2, "b", 1)),
                new RaceResult(true, Map.of())
        );

        new RaceGameViewModel(new OutputView(), eventListener).execute();


    }


}