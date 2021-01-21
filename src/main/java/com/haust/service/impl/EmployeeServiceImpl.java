package com.haust.service.impl;

import com.haust.pojo.Employee;
import com.haust.mapper.EmployeeMapper;
import com.haust.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 韩雪磊
 * @since 2021-01-21
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
