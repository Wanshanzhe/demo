package com.wsz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author : wanshanzhe
 * @date : 2022/3/21 9:20 下午
 */
@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {

    /**
     * 通用枚举
     */
    SUCCESS(200, "SUCCESS"),
    ERROR(200, "服务端异常"),

    /**
     * 登录模块
     */
    LOGIN_ERROR(500210, "用户名或密码错误"),
    MOBILE_ERROR(500211, "手机号码格式不正确"),

    /**I
     * 用户模块
     */
    USER_NOT_FOUND(400001, "用户不存在"),

    /**
     * 异常模块
     */
    BIND_ERROR(500212, "参数校验异常"),


    ;

    private final Integer code;
    private final String message;

}
