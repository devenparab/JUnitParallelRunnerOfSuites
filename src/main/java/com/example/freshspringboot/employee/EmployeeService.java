package com.example.freshspringboot.employee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {

    public String saveEmployee(){
        log.info("### Employee saved ###");
        return "Employee Saved";
    }
}
