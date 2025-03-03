package org.amuji.simple;

import org.amuji.simple.state.State;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationServiceTest {
    @Test
    void a_new_created_application_could_be_submitted() {
        Application draft = new Application();
        ApplicationService service = new ApplicationService();
        Application submitted = service.submit(draft);

        assertThat(submitted.getStatus()).isEqualTo(State.SUBMITTED);
    }

    @Test
    void a_submitted_application_could_be_approved() {
        Application submitted = new Application().setStatus(State.SUBMITTED);
        ApplicationService service = new ApplicationService();
        Application approved = service.approve(submitted);

        assertThat(approved.getStatus()).isEqualTo(State.APPROVED);
    }

    @Test
    void a_submitted_application_could_be_rejected() {
        Application submitted = new Application().setStatus(State.SUBMITTED);
        ApplicationService service = new ApplicationService();
        Application rejected = service.reject(submitted);

        assertThat(rejected.getStatus()).isEqualTo(State.REJECTED);
    }

}