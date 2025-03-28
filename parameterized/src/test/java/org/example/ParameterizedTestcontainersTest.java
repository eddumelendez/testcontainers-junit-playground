package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.BeforeParameterizedClassInvocation;
import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.provider.ValueSource;
import org.testcontainers.containers.GenericContainer;

@ParameterizedClass
@ValueSource(strings = {"redis:6-alpine", "redis:7-alpine"})
public class ParameterizedTestcontainersTest {

    @Parameter
    private String image;

    private static GenericContainer<?> redis;

    @BeforeParameterizedClassInvocation
    static void beforeInvocation(String image) throws Exception {
        redis = new GenericContainer<>(image)
                .withExposedPorts(6379);
        redis.start();
    }
    
    @Test
    void test() {
        System.out.println(redis.getDockerImageName());
        System.out.println(redis.getLogs());
    }
    
}
