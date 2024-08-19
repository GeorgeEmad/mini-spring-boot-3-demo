package com.mini.projects.di.dao;

import com.mini.projects.di.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;


@Repository
public class StudentDao implements IStudentDao {

    private EntityManager entityManager;

    @Autowired
    public StudentDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

}
