package org.amuji.simple.state;

import org.amuji.simple.Action;

public class PartiallyApprovedState implements ApplicationState {
    @Override
    public Status transition(Action action) {

        return null;
    }

    @Override
    public String getName() {
        return "";
    }
}
