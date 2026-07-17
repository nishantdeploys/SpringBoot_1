package com.nishant.demo.StudentServer.Repository;

import com.nishant.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {


//    public Student save(Student student){
//        System.out.println("Student Info Saved");
//        return student;
//    }


}
