package com.example.freshspringboot.student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentDB {

    public String studentDB(){
        log.info("### Student DB Connected ###");
        return "Student Connected";
    }
}
