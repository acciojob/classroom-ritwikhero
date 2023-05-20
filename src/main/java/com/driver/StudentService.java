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
    public void addTeacher(Teacher teacher) {
        studentRepository.addTeacher(teacher);
    }

    public Student getStudentByName(String name) {
        return studentRepository.getStudentByName(name);
    }

    public Teacher getTeacherByName(String name) {
    return studentRepository.getTeacherByName(name);
    }
    public List<String> getAllStudents() {
        return studentRepository.getAllStudents();
    }


    public void deleteAllTeachers() {
        studentRepository.deleteAllTeachers();
    }

    public Teacher deleteTeacherByName(String name) {
        return studentRepository.deleteTeacherByName(name);
    }
}
