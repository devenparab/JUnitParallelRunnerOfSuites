package com.example.freshspringboot.student;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Execution(ExecutionMode.CONCURRENT)
class StudentDBTest {

    @Autowired
    StudentDB studentDB;

    @Test
    @Execution(ExecutionMode.SAME_THREAD)
    void studentDB() throws InterruptedException {
        Thread.sleep(2000);
        log.info("### StudentDBTest >> studentDB() >> Thread Id [{}] ###",Thread.currentThread().getId());
        String result = studentDB.studentDB();
        assertNotNull(result);
    }
}