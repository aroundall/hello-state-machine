package org.amuji.simple;

import org.amuji.simple.state.Status;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationServiceTest {
    @Test
    void a_new_created_application_could_be_submitted() {
        Application draft = new Application();
        ApplicationService service = new ApplicationService();
        Application submitted = service.submit(draft);

        assertThat(submitted.getStatus()).isEqualTo(Status.SUBMITTED);
    }
}