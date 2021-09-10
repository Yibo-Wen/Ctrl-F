package com.ctrlf.demo.vo;

import lombok.Data;

/**
* @Author Yibo Wen
* @Date 9/2/2021 7:42 PM
**/
@Data
public class ResultVo<T> {

    private String code;

    private String msg;

    private T data;

    private ResultVo(T data){
        this.code = "000";
        this.msg = "success";
        this.data = data;
    }

    private ResultVo(BusinessError i){
        if(i != null) {
            this.code = i.getCode();
            this.msg = i.getMsg();
            this.data = null;
        }
    }

    public static <T> ResultVo<T> success(T data){
        return new ResultVo<>(data);
    }

    public static <T> ResultVo<T> error(BusinessError i){
        return new ResultVo<>(i);
    }
}
