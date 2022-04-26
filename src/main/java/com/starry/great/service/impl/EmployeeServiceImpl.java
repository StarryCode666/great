package com.starry.great.service.impl;

import com.starry.great.entity.Employee;
import com.starry.great.mapper.EmployeeMapper;
import com.starry.great.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息 服务实现类
 * </p>
 *
 * @author starry
 * @since 2022-04-17
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
