package org.amuji.simple;

import org.amuji.simple.state.State;

import java.util.UUID;

public class Application {
    public enum Type {
        SINGLE_LEVEL,
    }

    private final String id;
    private final Type type = Type.SINGLE_LEVEL;
    private State state;

    public Application() {
        this.id = UUID.randomUUID().toString();
        state = State.DRAFT;
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public State getStatus() {
        return state;
    }

    public Application setStatus(State state) {
        this.state = state;
        return this;
    }
}