package org.amuji.simple.state;

import org.amuji.simple.Application;

class RejectedState implements ApplicationState {
    private static final RejectedState INSTANCE = new RejectedState();
    private RejectedState() {}

    public static RejectedState getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(Application context) {
        System.out.println("Cannot approve - already rejected");
    }

    @Override
    public void reject(Application context) {
        System.out.println("Cannot reject - already rejected");
    }

    @Override
    public String getName() {
        return "REJECTED";
    }
}