package com.ctrlf.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @Author Yibo Wen
* @Date 9/2/2021 7:28 PM
* @Description Student Model
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;

    private String email;

    private Integer grade;

    private Double gpa;
}
