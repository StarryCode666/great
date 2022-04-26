package com.starry.great.service.impl;

import com.starry.great.entity.User;
import com.starry.great.mapper.UserMapper;
import com.starry.great.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author starry
 * @since 2022-04-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
