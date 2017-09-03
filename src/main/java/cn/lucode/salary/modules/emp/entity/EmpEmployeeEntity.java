package cn.lucode.salary.modules.emp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class EmpEmployeeEntity implements Serializable {
    private static final long serialVersionUID = 7849469948057792794L;

    private Long employeeId;

    /**
     * 员工名字
     */
    private String employeeName;

    /**
     * 部门ID
     */
    private Long deptId;

    private Date gmtModify;

    private Date gmtCreate;

    public EmpEmployeeEntity( String employeeName, Long deptId) {
        this.employeeName = employeeName;
        this.deptId = deptId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}