package com.haust.mapper;

import com.haust.pojo.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 韩雪磊
 * @since 2021-01-21
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

	int deleteAll();
}
