package org.amuji.simple.state;

public class StateFactory {

    public static ApplicationState get(State state) {
        return switch (state) {
            case DRAFT -> new DraftState();
            case SUBMITTED -> new SubmittedState();
            case PARTIALLY_APPROVED -> new PartiallyApprovedState();
            case APPROVED -> new ApprovedState();
            case REJECTED -> new RejectedState();
        };
    }
}
