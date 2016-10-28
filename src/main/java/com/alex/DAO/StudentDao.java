package com.alex.DAO;

import com.alex.Entity.Student;

import java.util.Collection;

/**
 * Created by alex on 28.10.16.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
