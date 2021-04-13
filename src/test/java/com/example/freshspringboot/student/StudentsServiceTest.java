package com.example.freshspringboot.student;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Execution(ExecutionMode.CONCURRENT)
class StudentsServiceTest {

    @Autowired
    StudentsService studentsService;

    @Test
    @DisplayName("SAVE STUDENT")
    @Execution(ExecutionMode.SAME_THREAD)
    void saveStudent() throws InterruptedException {
        Thread.sleep(2000);
        log.info("### StudentsServiceTest >> saveStudent() >> Thread Id [{}] ###",Thread.currentThread().getId());
        String result = studentsService.saveStudent();
        assertNotNull(result);
    }
}