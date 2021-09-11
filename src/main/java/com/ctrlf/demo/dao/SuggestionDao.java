package com.ctrlf.demo.dao;

import com.ctrlf.demo.domain.Suggestion;
import org.apache.ibatis.annotations.Mapper;

/**
* @Author Yibo Wen
* @Date 9/11/2021 1:24 PM
**/
@Mapper
public interface SuggestionDao {

    Boolean addSuggestion(Suggestion s);

}
