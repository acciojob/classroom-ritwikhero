package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository ;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }

    public Student getStudentByName(String name) {
        return studentRepository.getStudentByName(name);
    }

    public List<String> getAllStudents() {
        return studentRepository.getAllStudents();
    }
}
