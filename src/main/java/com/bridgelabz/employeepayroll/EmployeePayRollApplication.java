package com.bridgelabz.employeepayroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayRollApplication {

    public static void main(String[] args)
    {

        SpringApplication.run(EmployeePayRollApplication.class, args);
        log.info("employee Pay roll started");
    }


}
