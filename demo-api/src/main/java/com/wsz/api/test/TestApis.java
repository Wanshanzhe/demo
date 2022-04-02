package com.wsz.api.test;

import com.wsz.common.vo.BaseResponseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wanshanzhe
 * @version 1.0.0
 * @ClassName UserApis.java
 * @Description TODO
 * @createTime 2022年04月01日 16:54:00
 */
public interface TestApis {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    BaseResponseVO test();
}
