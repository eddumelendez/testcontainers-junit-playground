package org.example;

import org.junit.platform.suite.api.BeforeSuite;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.example")
class SuiteExample {

    @BeforeSuite
    static void beforeSuite() {
        ContainerConfig.redis.start();
    }

//    @AfterSuite
//    static void afterSuite() {
//        ContainerConfig.redis.stop();
//    }

}
