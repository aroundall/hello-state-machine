package org.amuji.simple;

import org.amuji.simple.state.ApplicationState;
import org.amuji.simple.state.SubmittedState;

public class Application {
    public enum Type {
        SINGLE_LEVEL,
        TWO_LEVEL
    }

    private final Type type;
    private ApplicationState currentState;

    public Application(Type type) {
        this.type = type;
        this.currentState = SubmittedState.getInstance();
    }

    public Type getType() {
        return type;
    }

    public void approve() {
        currentState.approve(this);
    }

    public void reject() {
        currentState.reject(this);
    }

    public void transitionTo(ApplicationState newState) {
        System.out.println("State changed from " + currentState.getName() + " to " + newState.getName());
        this.currentState = newState;
    }

    public String getState() {
        return currentState.getName();
    }
}