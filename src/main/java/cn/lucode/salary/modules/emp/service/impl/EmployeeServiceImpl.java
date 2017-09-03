//package cn.lucode.salary.modules.emp.service.impl;
//
//
//import cn.lucode.salary.modules.emp.dao.EmpEmployeeDao;
//import cn.lucode.salary.modules.emp.entity.EmpEmployeeEntity;
//import cn.lucode.salary.modules.emp.service.EmployeeService;
//import cn.lucode.salary.modules.sys.entity.SysRoleEntity;
//import cn.lucode.salary.modules.sys.service.SysRoleDeptService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
///**
// * 角色
//*/
//@Service("sysRoleService")
//public class EmployeeServiceImpl implements EmployeeService {
//	@Autowired
//	private EmpEmployeeDao empEmployeeDao;
//	@Autowired
//	private SysRoleDeptService saveOrUpdate
//
//
//	@Override
//	public EmpEmployeeEntity queryObject(Long employeeId) {
//		return empEmployeeDao.selectByPrimaryKey(employeeId);
//	}
//
//	@Override
//	public List<EmpEmployeeEntity> queryList(Map<String, Object> map) {
//		//return sysRoleDao.queryList(map);
//		return empEmployeeDao.selectList(map);
//	}
//
//	@Override
//	public int queryTotal(Map<String, Object> map) {
//		//return sysRoleDao.queryTotal(map);
//		return empEmployeeDao.queryTotal(map);
//	}
//
//	@Override
//	@Transactional
//	public void save(EmpEmployeeEntity employee) {
//		//employee.setCreateTime(new Date());
//		//EmpEmployeeDao.save(role);
//		empEmployeeDao.insert(employee);
//
//		//保存角色与菜单关系
//		//sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());
//
//		//保存角色与部门关系
//		sysRoleDeptService.saveOrUpdate(role.getRoleId(), role.getDeptIdList());
//	}
//
//	@Override
//	@Transactional
//	public void update(EmpEmployeeEntity employee) {
//		sysRoleDao.update(role);
//
//		//更新角色与菜单关系
//		sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());
//
//		//保存角色与部门关系
//		sysRoleDeptService.saveOrUpdate(role.getRoleId(), role.getDeptIdList());
//	}
//
//	@Override
//	@Transactional
//	public void deleteBatch(Long[] roleIds) {
//		sysRoleDao.deleteBatch(roleIds);
//	}
//
//}
