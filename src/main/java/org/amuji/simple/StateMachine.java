package org.amuji.simple;

import org.amuji.simple.state.ApplicationState;
import org.amuji.simple.state.StateFactory;
import org.amuji.simple.state.Status;

public class StateMachine {
    private final Application context;

    public void transition(Action action) {
        Status status = context.getStatus();
        ApplicationState state = StateFactory.get(status);
        Status transmitted = state.transition(action);
        context.setStatus(transmitted);
    }

    public StateMachine(Application context) {
        assert context != null;
        this.context = context;
    }

    public static StateMachine get(Application context) {
        if (context.getStatus() == null) {
            context.setStatus(Status.DRAFT);
        }
        return new StateMachine(context);
    }
}
