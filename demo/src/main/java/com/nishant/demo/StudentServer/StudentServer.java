package com.nishant.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {

    //1. Store the student (Post)
    @PostMapping("/create")
    public String storeStudent(){
        return """
                id : 1
                name : Mohit
                Department : CSE
                age : 22
                """;
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
