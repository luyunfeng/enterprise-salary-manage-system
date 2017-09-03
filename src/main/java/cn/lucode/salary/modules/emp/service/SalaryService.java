package cn.lucode.salary.modules.emp.service;

import cn.lucode.salary.modules.emp.entity.EmpSalaryEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by yunfeng.lu on 2017/8/20.
 */
public interface SalaryService {
    EmpSalaryEntity queryObject(Long salaryId);

	List<EmpSalaryEntity> queryList(Map<String, Object> map);

	int queryTotal(Map<String, Object> map);

	void save(EmpSalaryEntity salary);

	void update(EmpSalaryEntity salary);

	void deleteBatch(Long[] salaryIds);
}
