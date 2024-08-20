package com.mini.projects.di.dao;

import com.mini.projects.di.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


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

    @Override
    public Student findStudentById(int id){
        return entityManager.find(Student.class, id);
    }

    public List<Student> findAll(){
        TypedQuery <Student> typedQuery = entityManager.createQuery("FROM Student order by lastName", Student.class);
        return typedQuery.getResultList();
    }
}
