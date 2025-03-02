package org.amuji.simple.state;

import org.amuji.simple.Action;

public class SubmittedState implements ApplicationState {
    SubmittedState() {}

    @Override
    public ApplicationState transition(Action action) {

        return null;
    }

    @Override
    public State state() {
        return State.SUBMITTED;
    }
}
