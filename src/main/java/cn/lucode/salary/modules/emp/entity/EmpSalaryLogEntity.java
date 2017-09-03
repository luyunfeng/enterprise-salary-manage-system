package cn.lucode.salary.modules.emp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class EmpSalaryLogEntity implements Serializable {
    /**
     * 36位流水账号
     */
    private String logId;

    private Long employeeId;

    private BigDecimal salary;

    /**
     * 个人所得税
     */
    private BigDecimal tax;

    /**
     * 实际发放
     */
    private BigDecimal realSalary;

    private Date gmtModify;

    private Date gmtCreate;

    private static final long serialVersionUID = 1L;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(BigDecimal realSalary) {
        this.realSalary = realSalary;
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