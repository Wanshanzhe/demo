package com.wsz.controller;

import com.wsz.apis.test.TestFeignApis;
import com.wsz.common.vo.BaseResponseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wanshanzhe
 * @version 1.0.0
 * @ClassName TestController.java
 * @Description TODO
 * @createTime 2022年04月01日 17:31:00
 */

@Controller
@RequestMapping("/test")
public class TestController implements TestFeignApis {

    @RequestMapping("")
    @ResponseBody
    public BaseResponseVO test() {
        return BaseResponseVO.success("1111");
    }
}
