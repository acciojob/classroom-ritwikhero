package com.driver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher() {

    }
}