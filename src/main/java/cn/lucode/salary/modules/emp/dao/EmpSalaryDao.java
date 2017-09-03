package cn.lucode.salary.modules.emp.dao;

import cn.lucode.salary.modules.emp.entity.EmpSalaryEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpSalaryDao {
    int deleteByPrimaryKey(Long salaryId);

    int insert(EmpSalaryEntity record);

    int insertSelective(EmpSalaryEntity record);

    EmpSalaryEntity selectByPrimaryKey(Long salaryId);

    int updateByPrimaryKeySelective(EmpSalaryEntity record);

    int updateByPrimaryKey(EmpSalaryEntity record);
}