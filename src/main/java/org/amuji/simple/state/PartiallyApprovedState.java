package org.amuji.simple.state;

import org.amuji.simple.Application;

class PartiallyApprovedState implements ApplicationState {
    private static final PartiallyApprovedState INSTANCE = new PartiallyApprovedState();
    private PartiallyApprovedState() {}

    public static PartiallyApprovedState getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(Application context) {
        context.transitionTo(FullyApprovedState.getInstance());
    }

    @Override
    public void reject(Application context) {
        context.transitionTo(RejectedState.getInstance());
    }

    @Override
    public String getName() {
        return "PARTIALLY_APPROVED";
    }
}