package org.amuji.simple;

import org.amuji.simple.state.Status;

import java.util.UUID;

public class Application {
    public enum Type {
        SINGLE_LEVEL,
    }

    private final String id;
    private final Type type = Type.SINGLE_LEVEL;
    private Status status;

    public Application() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public Application setStatus(Status status) {
        this.status = status;
        return this;
    }
}