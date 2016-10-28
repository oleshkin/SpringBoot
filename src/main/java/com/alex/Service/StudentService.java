package com.alex.Service;

import com.alex.DAO.FakeStudentDaoImpl;
import com.alex.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private FakeStudentDaoImpl fakeStudentDaoImpl;

    public Collection<Student> getAllStudents() {
        return fakeStudentDaoImpl.getAllStudents();
    }

    public Student getStudentById(int id) {
        //TODO: check for get id
        return this.fakeStudentDaoImpl.getStudentById(id);
    }

    public void removeStudentById(int id) {
        // check if student with ID
        this.fakeStudentDaoImpl.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        this.fakeStudentDaoImpl.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.fakeStudentDaoImpl.insertStudentToDb(student);
    }
}
