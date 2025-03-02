package org.amuji.simple;

public class ApplicationService {
    public Application submit(Application application) {
        StateMachine stateMachine = StateMachine.get(application);
        stateMachine.transition(Action.SUBMIT);
        return application;
    }

    public Application approve(Application application) {
        StateMachine stateMachine = StateMachine.get(application);
        stateMachine.transition(Action.APPROVE);
        return application;
    }

    public Application reject(Application application) {
        StateMachine stateMachine = StateMachine.get(application);
        stateMachine.transition(Action.REJECT);
        return application;
    }
}
