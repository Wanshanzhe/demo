package com.wsz.exception;

import com.wsz.common.vo.BaseResponseVO;
import com.wsz.enums.RespBeanEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author wanshanzhe
 * @version 1.0.0
 * @ClassName BaseExceptionHandler.java
 * @Description 公共异常处理
 * @createTime 2022年04月01日 17:08:00
 */

@Slf4j
@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(Exception.class)
    public BaseResponseVO ExceptionHandler(Exception e) {
        if (e instanceof CommonServiceException) {
            CommonServiceException ex = (CommonServiceException) e;
            return BaseResponseVO.error(ex.getRespBeanEnum());
        } else if (e instanceof BindException) {
            BindException ex = (BindException) e;
            BaseResponseVO respBean = BaseResponseVO.error(RespBeanEnum.BIND_ERROR);
            respBean.setMessage("参数校验异常：" + ex.getBindingResult().getAllErrors().get(0).getDefaultMessage());
            return respBean;
        }
        return BaseResponseVO.error(RespBeanEnum.ERROR);
    }
}
