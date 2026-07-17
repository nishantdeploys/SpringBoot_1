package com.nishant.demo.StudentServer.Service;

import com.nishant.demo.StudentServer.Entity.Student;
import com.nishant.demo.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student studentValidate(Student student) {
        int id = student.getId();
        String name = student.getName();
        int age = student.getAge();
        String department = student.getDepartment();

        if(id < 0 || name == null || age < 0 || department == null) {
            return null;
        }
        studentRepository.save(student);
        return student;
    }

    public Student getStudnetById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student updatedStudent) {
        return studentRepository.save(updatedStudent);
    }

    public boolean deleteStudentById(int id) {
        if (!studentRepository.existsById(id)) {
            return false;
        }

        studentRepository.deleteById(id);
        return true;
    }


}
