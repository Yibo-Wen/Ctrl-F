package com.ctrlf.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
* @Author Yibo Wen
* @Date 9/11/2021 1:18 PM
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Suggestion {

    private String email;

    private String message;

    private String username;

    private Date created;
}
