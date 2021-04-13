package com.example.freshspringboot.employee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeDB {

    public String employeeDB(){
        log.info("### Employee DB Connected ###");
        return "Employee Connected";
    }
}
