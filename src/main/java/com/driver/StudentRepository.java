package com.driver;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Getter
@Setter
public class StudentRepository{
    Map<String,Student> students = new HashMap<>();

    public void addStudent(Student student){
        students.put(student.getName(),student);
    }

    public Student getStudentByName(String name) {
        return students.get(name);
    }

    public List<String> getAllStudents() {
        return new ArrayList<>(students.keySet());
    }
}
