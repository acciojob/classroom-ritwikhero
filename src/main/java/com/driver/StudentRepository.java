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
    Map<String,Teacher> teachers = new HashMap<>();



    public void addStudent(Student student){
        students.put(student.getName(),student);
    }
    public void addTeacher(Teacher teacher) {
        teachers.put(teacher.getName(),teacher);
    }

    public Student getStudentByName(String name) {
        return students.get(name);
    }
    public Teacher getTeacherByName(String name) {
        return teachers.get(name);
    }
    public List<String> getAllStudents() {
        return new ArrayList<>(students.keySet());
    }


    public void deleteAllTeachers() {
        teachers.clear();
    }

    public Teacher deleteTeacherByName(String name) {
//       return teachers.remove(name);
        for(Map.Entry<String,Teacher> teacher: teachers.entrySet()){
            if(teacher.getKey() != null && teacher.getKey().equals(name)){
                teachers.remove(teacher.getKey());
                return teacher.getValue();
            }
        }
        return null;
    }
}
