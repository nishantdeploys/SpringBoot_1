package com.nishant.demo.StudentServer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


public interface StudentRepository extends JpaRepository<Student, Integer> {


//    public Student save(Student student){
//        System.out.println("Student Info Saved");
//        return student;
//    }


}
