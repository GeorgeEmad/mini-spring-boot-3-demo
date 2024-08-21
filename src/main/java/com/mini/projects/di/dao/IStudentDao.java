package com.mini.projects.di.dao;

import com.mini.projects.di.entity.Student;

import java.util.List;

public interface IStudentDao {
    void save(Student student);
    Student findStudentById(int id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
