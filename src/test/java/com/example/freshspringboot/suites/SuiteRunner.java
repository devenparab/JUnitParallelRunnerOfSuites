package com.example.freshspringboot.suites;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SuiteRunner {
    /*public static void main(String[] args) throws InterruptedException {
        Result result = JUnitCore.runClasses(SuiteStudentUnitTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("#### Finished executing SuiteStudentUnitTest ####");
        System.out.println("#### Waiting for 5 Seconds ####");
        Thread.sleep(5000);
        result = JUnitCore.runClasses(SuiteStudentUnitTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }*/
    @Before
    public void addWaitBefore() throws InterruptedException {
        System.out.println("##### Adding Sleep 6 secs ####");
        Thread.sleep(6000);
    }

    @Test
    @Order(2)
    @DisplayName("STUDENT SUITE RUNNING")
    public void studentSuiteRunner() throws InterruptedException {
        System.out.println("### STARTING studentSuiteRunner() ####");
        Result result = JUnitCore.runClasses(SuiteStudentUnitTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("#### Finished executing studentSuiteRunner() ####");
    }

    @Test
    @Order(1)
    @DisplayName("EMPLOYEE SUITE RUNNING")
    public void employeeSuiteRunner() throws InterruptedException {
        System.out.println("### STARTING employeeSuiteRunner() ####");
        Result result = JUnitCore.runClasses(SuitEmployeeUnitTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("#### Finished executing employeeSuiteRunner() ####");
    }
}
