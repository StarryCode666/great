package com.starry.great.mapper;

import com.starry.great.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工信息 Mapper 接口
 * </p>
 *
 * @author starry
 * @since 2022-04-17
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
