package cn.lucode.salary.modules.emp.dao;

import cn.lucode.salary.modules.emp.entity.EmpEmployeeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmpEmployeeDao // extends BaseDao<EmpEmployeeEntity>
{
    int deleteByPrimaryKey(Long employeeId);

    int insert(EmpEmployeeEntity record);

    int insertSelective(EmpEmployeeEntity record);

    EmpEmployeeEntity selectByPrimaryKey(Long employeeId);

    List selectList(Map<String, Object> map);

    int updateByPrimaryKeySelective(EmpEmployeeEntity record);

    int updateByPrimaryKey(EmpEmployeeEntity record);

    int queryTotal(Map<String, Object> map);

}