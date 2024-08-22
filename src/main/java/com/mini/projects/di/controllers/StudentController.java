package com.mini.projects.di.controllers;

import com.mini.projects.di.dao.StudentDao;
import com.mini.projects.di.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

        @GetMapping("/getall")
    public List<StudentDto> getAllStudents(){
        List<StudentDto> students = new ArrayList<StudentDto>();
        students.add(new StudentDto("geo","emad"));
        students.add(new StudentDto("geo1","emad1"));
        students.add(new StudentDto("geo2","emad2"));
        students.add(new StudentDto("geo3","emad3"));
        return students;
    }
}
