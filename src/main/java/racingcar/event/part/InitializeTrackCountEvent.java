package racingcar.event.part;

import racingcar.domain.Track;
import racingcar.event.EventContext;
import racingcar.event.EventListener.ParameterEvent;

public record InitializeTrackCountEvent(EventContext eventContext) implements ParameterEvent<Integer> {
    @Override
    public void execute(Integer trackCount) {
        eventContext.saveTrackCount(new Track(trackCount));
    }
}
