package com.wsz.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wsz.apis.test.TestFeignApis;
import com.wsz.apis.test.user.UserFeignApis;
import com.wsz.common.vo.BaseResponseVO;
import com.wsz.enums.RespBeanEnum;
import com.wsz.exception.CommonServiceException;
import com.wsz.service.IUserService;
import com.wsz.test.pojp.User;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wanshanzhe
 * @since 2022-04-03
 */
@Controller
@RequestMapping("/user")
public class UserController implements UserFeignApis {

    @Autowired
    private IUserService userService;

    @GetMapping("/queryUserById/{id}")
    @ResponseBody
    public BaseResponseVO queryUserById(@PathVariable("id")String id) {
        User user = userService.getById(id);
        if (user == null){
            throw new CommonServiceException(RespBeanEnum.USER_NOT_FOUND);
        }

        return BaseResponseVO.success(user);
    }

    @GetMapping("/queryUserByCondition")
    @ResponseBody
    public BaseResponseVO queryUserByCondition(@RequestBody User user) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("name", user.getName());
        return BaseResponseVO.success(userService.getOne(wrapper));

    }

    @PostMapping("/saveUser")
    @ResponseBody
    public BaseResponseVO saveUser(@RequestBody User user){
        return BaseResponseVO.success(userService.save(user));
    }
}
