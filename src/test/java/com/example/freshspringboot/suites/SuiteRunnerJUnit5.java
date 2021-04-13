package com.example.freshspringboot.suites;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

@SpringBootTest
@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SuiteRunnerJUnit5 {
    //public static void main(String[] args) throws InterruptedException {
        /*final LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                                                        .selectors(selectClass(SuiteStudentUnitTest.class))
                                                        .build();

        final Launcher launcher = LauncherFactory.create();
        TestPlan testPlan = launcher.discover(request);
        final SummaryGeneratingListener listener = new SummaryGeneratingListener();

        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        long testFoundCount = summary.getTestsFoundCount();
        List<TestExecutionSummary.Failure> failures = summary.getFailures();
        System.out.println("getTestsSucceededCount() - " + summary.getTestsSucceededCount());
        failures.forEach(failure -> System.out.println("failure - " + failure.getException()));*/



        /*Result result = JUnitCore.runClasses(SuiteStudentUnitTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("#### Finished executing SuiteStudentUnitTest ####");
        System.out.println("#### Waiting for 5 Seconds ####");
        Thread.sleep(5000);
        result = JUnitCore.runClasses(SuiteStudentUnitTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }*/
    //}

    //############ Working ######################
    @Before
    public void addWaitBefore() throws InterruptedException {
        log.info("##### Adding Sleep 6 secs ####");
        Thread.sleep(6000);
    }

    @Test
    @Order(2)
    @DisplayName("STUDENT SUITE RUNNING")
    public void studentSuiteRunner() throws InterruptedException {
        log.info("### STARTING studentSuiteRunner() ####");
        Result result = JUnitCore.runClasses(SuiteStudentUnitTest.class);
        for (Failure failure : result.getFailures()) {
            log.info("### studentSuiteRunner() :: falure : [{}] ###",failure.toString());
        }
        System.out.println("#### Finished executing studentSuiteRunner() ####");
    }

    @Test
    @Order(1)
    @DisplayName("EMPLOYEE SUITE RUNNING")
    public void employeeSuiteRunner() throws InterruptedException {
        log.info("### STARTING employeeSuiteRunner() ####");
        Result result = JUnitCore.runClasses(SuitEmployeeUnitTest.class);
        for (Failure failure : result.getFailures()) {
            log.info("### employeeSuiteRunner() :: falure : [{}] ###",failure.toString());
        }
        System.out.println("#### Finished executing employeeSuiteRunner() ####");
    }
    //############ Working ######################


   /* @Before
    public void addWaitBefore() throws InterruptedException {
        log.info("##### Adding Sleep 6 secs ####");
        Thread.sleep(6000);
    }

    @Test
    @Order(2)
    @DisplayName("STUDENT SUITE RUNNING")
    public void studentSuiteRunner() throws InterruptedException {
        log.info("### STARTING studentSuiteRunner() ####");
        *//*Result result = JUnitCore.runClasses(SuiteStudentUnitTest.class);
        for (Failure failure : result.getFailures()) {
            log.info("### studentSuiteRunner() :: falure : [{}] ###",failure.toString());
        }
        System.out.println("#### Finished executing studentSuiteRunner() ####");*//*

        final LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(SuiteStudentUnitTest.class))
                .build();

        final Launcher launcher = LauncherFactory.create();
        TestPlan testPlan = launcher.discover(request);
        final SummaryGeneratingListener listener = new SummaryGeneratingListener();

        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        long testFoundCount = summary.getTestsFoundCount();
        List<TestExecutionSummary.Failure> failures = summary.getFailures();
        System.out.println("getTestsSucceededCount() - " + summary.getTestsSucceededCount());
        failures.forEach(failure -> System.out.println("failure - " + failure.getException()));
    }*/

    /*@Test
    @Order(1)
    @DisplayName("EMPLOYEE SUITE RUNNING")
    public void employeeSuiteRunner() throws InterruptedException {
        log.info("### STARTING employeeSuiteRunner() ####");
        Result result = JUnitCore.runClasses(SuitEmployeeUnitTest.class);
        for (Failure failure : result.getFailures()) {
            log.info("### employeeSuiteRunner() :: falure : [{}] ###",failure.toString());
        }
        System.out.println("#### Finished executing employeeSuiteRunner() ####");
    }*/
}
