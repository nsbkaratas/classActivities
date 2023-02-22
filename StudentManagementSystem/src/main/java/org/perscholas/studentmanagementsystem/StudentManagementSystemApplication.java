package org.perscholas.studentmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EntityScan("<package with entities>")
@SpringBootApplication
public class StudentManagementSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

}
