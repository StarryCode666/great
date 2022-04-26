package com.starry.great.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.starry.great.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息 前端控制器
 * </p>
 *
 * @author starry
 * @since 2022-04-17
 */
@RestController
@RequestMapping("/great/user")
@CrossOrigin
public class UserController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/hello")
    public String test(){
        Page page = employeeMapper.selectPage(new Page<>(0,10),null);
        return "hello great!";
    }
}

