package com.crazy.employee.manage.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zhxm
 * @version 1.0.0
 * @ClassName Employee
 * @Description 职工信息
 * @date 2023-11-29
 */
@ApiModel(value = "职工信息",description = "")
public class Employee implements Serializable,Cloneable{
    /** 职工ID */
    @ApiModelProperty(name = "职工ID",notes = "")
    private Integer id ;
    /** 职工姓名 */
    @ApiModelProperty(name = "职工姓名",notes = "")
    private String empName ;
    /** 性别，1：男，2：女 */
    @ApiModelProperty(name = "性别",notes = "1：男，2：女")
    private Integer sex ;
    /** 年龄 */
    @ApiModelProperty(name = "年龄",notes = "")
    private Integer age ;
    /** 部门，1：业务部，2：后勤部，3：人事部 */
    @ApiModelProperty(name = "部门",notes = "1：业务部，2：后勤部，3：人事部")
    private Integer deptName ;
    /** 学历，1：大专，2：本科，3：研究生 */
    @ApiModelProperty(name = "学历",notes = "1：大专，2：本科，3：研究生")
    private Integer empDegreeName ;

    /** 职工ID */
    public Integer getId(){
        return this.id;
    }
    /** 职工ID */
    public void setId(Integer id){
        this.id=id;
    }
    /** 职工姓名 */
    public String getEmpName(){
        return this.empName;
    }
    /** 职工姓名 */
    public void setEmpName(String empName){
        this.empName=empName;
    }
    /** 性别，1：男，2：女 */
    public Integer getSex(){
        return this.sex;
    }
    /** 性别，1：男，2：女 */
    public void setSex(Integer sex){
        this.sex=sex;
    }
    /** 年龄 */
    public Integer getAge(){
        return this.age;
    }
    /** 年龄 */
    public void setAge(Integer age){
        this.age=age;
    }
    /** 部门，1：业务部，2：后勤部，3：人事部 */
    public Integer getDeptName(){
        return this.deptName;
    }
    /** 部门，1：业务部，2：后勤部，3：人事部 */
    public void setDeptName(Integer deptName){
        this.deptName=deptName;
    }
    /** 学历，1：大专，2：本科，3：研究生 */
    public Integer getEmpDegreeName(){
        return this.empDegreeName;
    }
    /** 学历，1：大专，2：本科，3：研究生 */
    public void setEmpDegreeName(Integer empDegreeName){
        this.empDegreeName=empDegreeName;
    }
}
