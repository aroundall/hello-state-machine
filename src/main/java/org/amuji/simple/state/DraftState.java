package org.amuji.simple.state;

import org.amuji.simple.Action;

public class DraftState implements ApplicationState {
    @Override
    public Status transition(Action action) {
        if (action != Action.SUBMIT) {
            throw new IllegalArgumentException("Does not support this action.");
        }
        return Status.SUBMITTED;
    }

    @Override
    public String getName() {
        return "";
    }
}
