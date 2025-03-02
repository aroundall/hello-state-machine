package org.amuji.simple.state;

import org.amuji.simple.Application;

public class SubmittedState implements ApplicationState {
    private static final SubmittedState INSTANCE = new SubmittedState();
    private SubmittedState() {}

    public static SubmittedState getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(Application context) {
        if (context.getType() == Application.Type.SINGLE_LEVEL) {
            context.transitionTo(FullyApprovedState.getInstance());
        } else {
            context.transitionTo(PartiallyApprovedState.getInstance());
        }
    }

    @Override
    public void reject(Application context) {
        context.transitionTo(RejectedState.getInstance());
    }

    @Override
    public String getName() {
        return "SUBMITTED";
    }
}
