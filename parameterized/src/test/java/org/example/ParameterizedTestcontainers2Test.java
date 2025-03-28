package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.BeforeParameterizedClassInvocation;
import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.provider.MethodSource;
import org.testcontainers.containers.GenericContainer;

import java.util.List;

@ParameterizedClass
@MethodSource("containers")
public class ParameterizedTestcontainers2Test {

    static List<GenericContainer<?>> containers() {
        return List.of(
                new GenericContainer<>("redis:6-alpine"),
                new GenericContainer<>("redis:7-alpine")
        );
    }
    
    @Parameter
    private GenericContainer<?> container;

    @BeforeParameterizedClassInvocation
    static void beforeInvocation(GenericContainer<?> container) throws Exception {
        container.start();
    }
    
    @Test
    void test() {
        System.out.println(this.container.getDockerImageName());
        System.out.println(this.container.getContainerId());
        System.out.println(this.container.getLogs());
    }

    @Test
    void test2() {
        System.out.println(this.container.getDockerImageName());
        System.out.println(this.container.getContainerId());
        System.out.println(this.container.getLogs());
    }
    
}
