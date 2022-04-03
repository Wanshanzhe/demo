package com.wsz.exception;

import com.wsz.enums.RespBeanEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wanshanzhe
 * @version 1.0.0
 * @ClassName CommonServiceException.java
 * @Description 公共的业务逻辑错误
 * @createTime 2022年04月01日 17:07:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonServiceException extends RuntimeException{

    private RespBeanEnum respBeanEnum;
}
