package com.wsz.service.impl;

import com.wsz.test.pojp.User;
import com.wsz.mapper.UserMapper;
import com.wsz.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanshanzhe
 * @since 2022-04-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
