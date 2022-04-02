package com.wsz.common.vo;

import com.wsz.exception.CommonServiceException;
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

    // 成功但是无参数
    public static BaseResponseVO success(){
        BaseResponseVO response = new BaseResponseVO();
        response.setCode(200);
        response.setMessage("");
        return response;
    }

    // 成功有参数
    public static<M> BaseResponseVO success(M data){
        BaseResponseVO response = new BaseResponseVO();
        response.setCode(200);
        response.setMessage("");
        response.setData(data);
        return response;
    }

    // 出现业务异常
    public static<M> BaseResponseVO serviceException(CommonServiceException e){
        BaseResponseVO response = new BaseResponseVO();
        response.setCode(e.getCode());
        response.setMessage(e.getMessage());
        return response;
    }

}
