package cn.lucode.salary.modules.emp.service.impl;

import cn.lucode.salary.modules.emp.dao.EmpSalaryDao;
import cn.lucode.salary.modules.emp.entity.EmpSalaryEntity;
import cn.lucode.salary.modules.emp.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by yunfeng.lu on 2017/8/20.
 */
@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private EmpSalaryDao empSalaryDao;
    @Override
    public EmpSalaryEntity queryObject(Long salaryId) {
        return empSalaryDao.selectByPrimaryKey(salaryId);
    }

    @Override
    public List<EmpSalaryEntity> queryList(Map<String, Object> map) {
        //empSalaryDao.
        return null;
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return 0;
    }

    @Override
    public void save(EmpSalaryEntity salary) {
        empSalaryDao.insert(salary);
    }

    @Override
    public void update(EmpSalaryEntity salary) {
        // 跟新 salary
        empSalaryDao.updateByPrimaryKeySelective(salary);
    }


    @Override
    public void deleteBatch(Long[] salaryIds) {

    }
}
