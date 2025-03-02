package org.amuji.simple;

import org.amuji.simple.state.ApplicationState;
import org.amuji.simple.state.StateFactory;
import org.amuji.simple.state.State;

public class StateMachine {
    private final Application context;

    public void transition(Action action) {
        State status = context.getStatus();
        ApplicationState state = StateFactory.get(status);
        ApplicationState transmitted = state.transition(action);
        context.setStatus(transmitted.state());
    }

    public StateMachine(Application context) {
        assert context != null;
        this.context = context;
    }

    public static StateMachine get(Application context) {
        if (context.getStatus() == null) {
            context.setStatus(State.DRAFT);
        }
        return new StateMachine(context);
    }
}
