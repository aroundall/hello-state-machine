package org.amuji.simple.state;

import org.amuji.simple.Application;

class FullyApprovedState implements ApplicationState {
    private static final FullyApprovedState INSTANCE = new FullyApprovedState();
    private FullyApprovedState() {}

    public static FullyApprovedState getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(Application context) {
        System.out.println("Cannot approve - already fully approved");
    }

    @Override
    public void reject(Application context) {
        System.out.println("Cannot reject - already fully approved");
    }

    @Override
    public String getName() {
        return "FULLY_APPROVED";
    }
}