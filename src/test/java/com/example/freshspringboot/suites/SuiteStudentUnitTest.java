package com.example.freshspringboot.suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.example.freshspringboot.student"})
public class SuiteStudentUnitTest {
}
