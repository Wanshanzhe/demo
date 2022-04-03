package com.wsz.api.test.user;

import com.wsz.common.vo.BaseResponseVO;
import com.wsz.test.pojp.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wanshanzhe
 * @version 1.0.0
 * @ClassName UserApis.java
 * @Description
 * @createTime 2022年04月01日 16:54:00
 */
public interface UserApis {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    BaseResponseVO queryUserById(@PathVariable("id") String id);

    @RequestMapping(value = "queryUserByCondition", method = RequestMethod.GET)
    BaseResponseVO queryUserByCondition(User user);

    @RequestMapping(value = "saveUser", method = RequestMethod.POST)
    BaseResponseVO saveUser(User user);

}
