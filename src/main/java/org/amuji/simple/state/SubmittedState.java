package org.amuji.simple.state;

import org.amuji.simple.Action;

public class SubmittedState implements ApplicationState {
    SubmittedState() {}

    @Override
    public ApplicationState transition(Action action) {
        return switch (action) {
            case APPROVE -> new ApprovedState();
            case REJECT -> new RejectedState();
            default -> throw new IllegalArgumentException("Invalid action: " + action);
        };
    }

    @Override
    public State state() {
        return State.SUBMITTED;
    }
}
