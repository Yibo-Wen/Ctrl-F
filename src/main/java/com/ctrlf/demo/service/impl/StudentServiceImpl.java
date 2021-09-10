package com.ctrlf.demo.service.impl;

import com.ctrlf.demo.dao.StudentDao;
import com.ctrlf.demo.domain.Student;
import com.ctrlf.demo.service.StudentService;
import com.ctrlf.demo.vo.BusinessError;
import com.ctrlf.demo.vo.ResultVo;
import com.ctrlf.demo.service.dto.StudentDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Author Yibo Wen
* @Date 9/2/2021 8:05 PM
* @Description
**/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public ResultVo<List<Student>> getAllStudents() {
        List<Student> students = studentDao.getAllStudents();
        if(students.isEmpty()){
            return ResultVo.error(BusinessError.UNKNOWN_ERROR);
        }else{
            return ResultVo.success(students);
        }
    }

    @Override
    public ResultVo<Boolean> addStudent(StudentDto s) {
        Student student = new Student();
        BeanUtils.copyProperties(s,student);
        Boolean result = studentDao.addStudent(student);
        if(!result){
            return ResultVo.error(BusinessError.UNKNOWN_ERROR);
        }else{
            return ResultVo.success(true);
        }
    }
}
