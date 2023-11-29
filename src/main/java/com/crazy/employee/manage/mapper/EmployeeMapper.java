package com.crazy.employee.manage.mapper;

import com.crazy.employee.manage.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhxm
 * @version 1.0.0
 * @ClassName EmployeeMapper
 * @Description
 * @date 2023-11-29
 */
@Mapper
public interface EmployeeMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Employee queryById(Integer id);

    /**
     * 分页查询指定行数据
     * @param employee
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Employee> queryAllByLimit(@Param("employee")Employee employee,@Param("pageNum")int pageNum, @Param("pageSize")int pageSize);
    /**
     * 统计总行数
     *
     * @param employee 查询条件
     * @return 总行数
     */
    long count(Employee employee);
    /**
     * 新增数据
     *
     * @param employee 实例对象
     * @return 影响行数
     */
    int insert(Employee employee);
    /**
     * 批量新增数据
     *
     * @param entities List<Employee> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Employee> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<Employee> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Employee> entities);
    /**
     * 更新数据
     *
     * @param employee 实例对象
     * @return 影响行数
     */
    int update(Employee employee);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
