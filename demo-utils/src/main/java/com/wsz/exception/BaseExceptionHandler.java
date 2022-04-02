package com.wsz.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wanshanzhe
 * @version 1.0.0
 * @ClassName BaseExceptionHandler.java
 * @Description 公共异常处理
 * @createTime 2022年04月01日 17:08:00
 */

@Slf4j
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(CommonServiceException.class)
    @ResponseBody
    public BaseResponseVO serviceExceptionHandler(HttpServletRequest request, CommonServiceException e){
        log.error("CommonServiceException, code:{}, message",
                e.getCode(),e.getMessage());

        return BaseResponseVO.serviceException(e);
    }
}
