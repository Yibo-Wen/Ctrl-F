package com.ctrlf.demo.service;

import com.ctrlf.demo.domain.Suggestion;
import com.ctrlf.demo.vo.ResultVo;
import org.springframework.stereotype.Service;

/**
* @Author Yibo Wen
* @Date 9/11/2021 1:21 PM
**/
@Service
public interface SuggestionService {

    ResultVo<Boolean> addSuggestion(Suggestion s);

}
