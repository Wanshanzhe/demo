package com.wsz.common.vo;

import com.wsz.enums.RespBeanEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wanshanzhe
 * @version 1.0.0
 * @ClassName BaseResponseVO.java
 * @Description 表现层公共返回
 * @createTime 2022年04月01日 17:05:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponseVO<M> {

    private Integer code;   // 业务编号
    private String message; // 异常信息
    private M data;         // 业务数据返回

    /**
     * 成功的返回结果
     * @return
     */
    public static BaseResponseVO success(){
        return new BaseResponseVO(RespBeanEnum.SUCCESS.getCode(), RespBeanEnum.SUCCESS.getMessage(), null);
    }

    /**
     * 成功的返回结果（携带对象）
     * @return
     */
    public static<M> BaseResponseVO success(M data){
        return new BaseResponseVO(RespBeanEnum.SUCCESS.getCode(), RespBeanEnum.SUCCESS.getMessage(), data);
    }

    /**
     * 失败的返回结果
     * @return
     */
    public static BaseResponseVO error(RespBeanEnum respBeanEnum){
        return new BaseResponseVO(respBeanEnum.getCode(), respBeanEnum.getMessage(), null);
    }


    /**
     * 失败的返回结果（携带对象）
     * @return
     */
    public static BaseResponseVO error(RespBeanEnum respBeanEnum, Object obj){
        return new BaseResponseVO(respBeanEnum.getCode(), respBeanEnum.getMessage(), obj);
    }

}
