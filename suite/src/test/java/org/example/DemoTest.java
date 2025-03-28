package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All - Redis id: "  + ContainerConfig.redis.getContainerId());
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All - Redis id: "  + ContainerConfig.redis.getContainerId());
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each - Redis id: "  + ContainerConfig.redis.getContainerId());
    }

    @AfterEach
    void afterEach() {
        System.out.println("After Each - Redis id: "  + ContainerConfig.redis.getContainerId());
    }

    @Test
    void test() {
        System.out.println("Redis id: "  + ContainerConfig.redis.getContainerId());
    }

}
