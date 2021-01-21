package com.haust.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haust.pojo.Employee;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{

}
