package com.example.sms2;

import com.example.sms2.course.CourseService;
import com.example.sms2.institution.InstitutionService;
import com.example.sms2.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sms2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sms2Application.class, args);
    }




}
