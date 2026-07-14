package com.nishant.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {

    //1. Store the student (Post)
    @PostMapping("/create")
    public String storeStudent(@RequestBody Student student) {
        int id = student.getId();
        String name = student.getName();
        int age = student.getAge();
        String department = student.getDepartment();
        return "id: " + id + ", name: " + name + ", age: " + age + ", department: " + department;
    }


    //2. Read the Student with id (Get)
    public String getStudentid(){
        return "StudentID: ";
    }


    //3. Update the student information (Put,Patch)
    public String updateStudent(){
        return "Student Updated";
    }


    //4. delete the student information (Delete)
    public String deleteStudent(){
        return "Student Deleted";
    }

}
