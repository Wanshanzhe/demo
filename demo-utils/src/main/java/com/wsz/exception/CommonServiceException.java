package com.wsz.exception;

import lombok.Data;

/**
 * @author wanshanzhe
 * @version 1.0.0
 * @ClassName CommonServiceException.java
 * @Description 公共的业务逻辑错误
 * @createTime 2022年04月01日 17:07:00
 */
@Data
public class CommonServiceException extends Exception{

    private Integer code;
    private String message;

    public CommonServiceException(int code,String message){
        this.code = code;
        this.message = message;
    }
}
