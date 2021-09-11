package com.ctrlf.demo.controller;

import com.ctrlf.demo.domain.Student;
import com.ctrlf.demo.domain.Suggestion;
import com.ctrlf.demo.service.StudentService;
import com.ctrlf.demo.service.SuggestionService;
import com.ctrlf.demo.service.dto.StudentDto;
import com.ctrlf.demo.vo.ResultVo;
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
* @Date 9/11/2021 1:16 PM
**/
@RestController
@RequestMapping(value = "/suggestion")
@EnableAutoConfiguration
public class SuggestionController {
    @Autowired
    private SuggestionService suggestionService;

    private final Logger log = LoggerFactory.getLogger(SuggestionController.class);

    @PostMapping
    public ResultVo<Boolean> addSuggestion(Suggestion s){
        log.info("saving suggestion...");
        return suggestionService.addSuggestion(s);
    }
}
