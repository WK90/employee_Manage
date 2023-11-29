package com.crazy.employee.manage.service;

import com.crazy.employee.manage.domain.Employee;

import java.util.List;

/**
 * @author zhxm
 * @version 1.0.0
 * @ClassName EmployeeService
 * @Description
 * @date 2023-11-29
 */
public interface EmployeeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Employee queryById(Integer id);
    /**
     * 分页查询
     *
     * @param employee 筛选条件
     * @return 查询结果
     */
    List<Employee> pageQuery(Employee employee,Integer pageNum,Integer pageSize);
    /**
     * 新增数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    Employee insert(Employee employee);
    /**
     * 更新数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    Employee update(Employee employee);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
