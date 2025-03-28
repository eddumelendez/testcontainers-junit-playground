package org.example;

import org.junit.jupiter.api.AutoClose;
import org.testcontainers.containers.GenericContainer;

class ContainerConfig {

    @AutoClose
    static final GenericContainer<?> redis = new GenericContainer<>("redis:7-alpine")
            .withExposedPorts(6379);

}
