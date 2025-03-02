package org.amuji.simple.state;

import org.amuji.simple.Action;

public class RejectedState implements ApplicationState {
    @Override
    public ApplicationState transition(Action action) {

        return null;
    }

    @Override
    public State state() {
        return State.REJECTED;
    }
}
