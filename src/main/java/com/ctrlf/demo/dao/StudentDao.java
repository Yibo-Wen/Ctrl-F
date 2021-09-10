package com.ctrlf.demo.dao;

import com.ctrlf.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @Author Yibo Wen
* @Date 9/2/2021 7:33 PM
**/
@Mapper
public interface StudentDao {

    List<Student> getAllStudents();

    Boolean addStudent(Student s);

}
