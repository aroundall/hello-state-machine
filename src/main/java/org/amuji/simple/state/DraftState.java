package org.amuji.simple.state;

import org.amuji.simple.Action;

public class DraftState implements ApplicationState {
    @Override
    public ApplicationState transition(Action action) {
        if (action != Action.SUBMIT) {
            throw new IllegalArgumentException("Does not support this action.");
        }
        return new SubmittedState();
    }

    @Override
    public State state() {
        return State.DRAFT;
    }
}
