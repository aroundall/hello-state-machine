package org.amuji.simple.state;

import org.amuji.simple.Action;

public interface ApplicationState {
    Status transition(Action action);
    String getName();
}