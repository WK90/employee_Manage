package com.crazy.employee.manage.service.impl;

import com.crazy.employee.manage.domain.Employee;
import com.crazy.employee.manage.mapper.EmployeeMapper;
import com.crazy.employee.manage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhxm
 * @version 1.0.0
 * @ClassName EmployeeServiceImpl
 * @Description
 * @date 2023-11-29
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Employee queryById(Integer id){
        return employeeMapper.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param employee 筛选条件
     * @return 查询结果
     */
    @Override
    public List<Employee> pageQuery(Employee employee,Integer pageNum,Integer pageSize){
        return employeeMapper.queryAllByLimit(employee,pageNum,pageSize);
    }

    /**
     * 新增数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    @Override
    public Employee insert(Employee employee){
        employeeMapper.insert(employee);
        return employee;
    }

    /**
     * 更新数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    @Override
    public Employee update(Employee employee){
        employeeMapper.update(employee);
        return queryById(employee.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id){
        int total = employeeMapper.deleteById(id);
        return total > 0;
    }

}
