package com.nishant.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRepository {

    public Student save(Student student){
        System.out.println("Student Info Saved");
        return student;
    }
    
}
