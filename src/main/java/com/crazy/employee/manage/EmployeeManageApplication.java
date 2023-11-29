package com.crazy.employee.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhxm
 */
@EnableSwagger2
@SpringBootApplication
public class EmployeeManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManageApplication.class, args);
    }

}
