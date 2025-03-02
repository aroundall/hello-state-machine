package org.amuji.simple.state;

import org.amuji.simple.Action;

public interface ApplicationState {
    ApplicationState transition(Action action);
    State state();
}