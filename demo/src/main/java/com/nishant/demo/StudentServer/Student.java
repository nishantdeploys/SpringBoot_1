package com.nishant.demo.StudentServer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    long id;
    String name;
    int age;
    String department;

}
