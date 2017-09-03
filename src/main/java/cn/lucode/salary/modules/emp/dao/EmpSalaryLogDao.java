package cn.lucode.salary.modules.emp.dao;

import cn.lucode.salary.modules.emp.entity.EmpSalaryLogEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpSalaryLogDao {
    int deleteByPrimaryKey(String logId);

    int insert(EmpSalaryLogEntity record);

    int insertSelective(EmpSalaryLogEntity record);

    EmpSalaryLogEntity selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(EmpSalaryLogEntity record);

    int updateByPrimaryKey(EmpSalaryLogEntity record);
}