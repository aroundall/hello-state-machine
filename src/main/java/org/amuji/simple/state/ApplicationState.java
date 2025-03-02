package org.amuji.simple.state;

import org.amuji.simple.Application;

public interface ApplicationState {
    void approve(Application context);
    void reject(Application context);
    String getName();
}