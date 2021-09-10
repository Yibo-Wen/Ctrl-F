package com.ctrlf.demo.controller;

import com.ctrlf.demo.domain.Student;
import com.ctrlf.demo.service.StudentService;
import com.ctrlf.demo.vo.ResultVo;
import com.ctrlf.demo.service.dto.StudentDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Yibo Wen
 * @Date 9/2/2021 8:25 PM
 **/
@RestController
@RequestMapping(value = "/student")
@EnableAutoConfiguration
public class StudentController {

    @Autowired
    private StudentService studentService;

    private final Logger log = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping
    public ResultVo<List<Student>> getAllStudents(){
        log.info("get all students from database...");
        return studentService.getAllStudents();
    }

    @PostMapping
    public ResultVo<Boolean> addStudent(StudentDto s){
        log.info("get all students from database...");
        return studentService.addStudent(s);
    }

}
