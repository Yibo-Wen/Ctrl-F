package com.ctrlf.demo.service;

import com.ctrlf.demo.vo.ResultVo;
import com.ctrlf.demo.domain.Student;
import com.ctrlf.demo.service.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Author Yibo Wen
* @Date 9/2/2021 7:36 PM
**/
@Service
public interface StudentService {
    ResultVo<List<Student>> getAllStudents();

    ResultVo<Boolean> addStudent(StudentDto s);
}
