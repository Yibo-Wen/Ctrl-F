package com.ctrlf.demo.service.impl;

import com.ctrlf.demo.dao.SuggestionDao;
import com.ctrlf.demo.domain.Suggestion;
import com.ctrlf.demo.service.SuggestionService;
import com.ctrlf.demo.vo.BusinessError;
import com.ctrlf.demo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;

/**
* @Author Yibo Wen
* @Date 9/11/2021 1:22 PM
**/
public class SuggestionServiceImpl implements SuggestionService {

    @Autowired
    SuggestionDao suggestionDao;

    @Override
    public ResultVo<Boolean> addSuggestion(Suggestion s) {
        Boolean result = suggestionDao.addSuggestion(s);
        if(!result){
            return ResultVo.error(BusinessError.UNKNOWN_ERROR);
        }else{
            return ResultVo.success(true);
        }
    }

}
