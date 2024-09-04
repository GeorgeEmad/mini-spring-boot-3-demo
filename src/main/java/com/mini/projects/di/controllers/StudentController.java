package com.mini.projects.di.controllers;

import com.mini.projects.di.dao.StudentDao;
import com.mini.projects.di.dto.StudentDto;
import com.mini.projects.di.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private List<StudentDto> students;

    @PostConstruct
    private void initData(){
        students = new ArrayList<StudentDto>();
        students.add(new StudentDto("geo","emad"));
        students.add(new StudentDto("geo1","emad1"));
        students.add(new StudentDto("geo2","emad2"));
        students.add(new StudentDto("geo3","emad3"));
    }

    @GetMapping("/getall")
    public List<StudentDto> getAllStudents(){
        return students;
    }

    @GetMapping("/{firstName}")
    public Optional<StudentDto> getByFirstName(@PathVariable String firstName){
        if(firstName.equals("exception")){
            throw new StudentNotFoundException("Student name not found " + firstName);
        }
        return students.stream().filter(x -> Objects.equals(x.getFirstName(), firstName)).findFirst();
    }
}
