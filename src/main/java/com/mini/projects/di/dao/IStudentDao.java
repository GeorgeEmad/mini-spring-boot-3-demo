package com.mini.projects.di.dao;

import com.mini.projects.di.entity.Student;

import java.util.List;

public interface IStudentDao {
    void save(Student student);
    Student findStudentById(int id);
    List<Student> findAll();
}
