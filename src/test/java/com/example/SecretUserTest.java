package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// aufgabe 4: beweist, dass das GitHub-Secret wirklich im Workflow ankommt; fehlt es, wird der Build rot
class SecretUserTest {

    @Test
    void secretShouldBeAvailable() {
        assertTrue(SecretUser.hasSecret(), "APP_SECRET_TOKEN ist nicht gesetzt");
    }
}
