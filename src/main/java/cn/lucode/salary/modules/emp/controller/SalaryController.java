package cn.lucode.salary.modules.emp.controller;

import cn.lucode.salary.common.annotation.SysLog;
import cn.lucode.salary.common.utils.Constant;
import cn.lucode.salary.common.utils.PageUtils;
import cn.lucode.salary.common.utils.Query;
import cn.lucode.salary.common.utils.R;
import cn.lucode.salary.common.validator.ValidatorUtils;
import cn.lucode.salary.modules.emp.entity.EmpSalaryEntity;
import cn.lucode.salary.modules.emp.service.SalaryService;
import cn.lucode.salary.modules.sys.controller.AbstractController;
import cn.lucode.salary.modules.sys.entity.SysRoleEntity;
import cn.lucode.salary.modules.sys.service.SysRoleDeptService;
import cn.lucode.salary.modules.sys.service.SysRoleMenuService;
import cn.lucode.salary.modules.sys.service.SysRoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 角色管理
 */
@RestController
@RequestMapping("/emp/salary")
public class SalaryController extends AbstractController {
	@Autowired
	private SalaryService salaryService;

	
//	/**
//	 * 角色列表
//	 */
//	@RequestMapping("/list")
//	@RequiresPermissions("sys:role:list")
//	public R list(@RequestParam Map<String, Object> params){
//		//如果不是超级管理员，则只查询自己创建的角色列表
//		if(getUserId() != Constant.SUPER_ADMIN){
//			params.put("createUserId", getUserId());
//		}
//
//		//查询列表数据
//		Query query = new Query(params);
//		List<SysRoleEntity> list = salaryService.queryList(query);
//		int total = salaryService.queryTotal(query);
//
//		PageUtils pageUtil = new PageUtils(list, total, query.getLimit(), query.getPage());
//
//		return R.ok().put("page", pageUtil);
//	}
//
//
//	/**
//	 * 角色信息
//	 */
//	@RequestMapping("/info/{roleId}")
//	@RequiresPermissions("sys:role:info")
//	public R info(@PathVariable("roleId") Long roleId){
//		SysRoleEntity role = sysRoleService.queryObject(roleId);
//
//		//查询角色对应的菜单
//		List<Long> menuIdList = sysRoleMenuService.queryMenuIdList(roleId);
//		role.setMenuIdList(menuIdList);
//
//		//查询角色对应的部门
//		List<Long> deptIdList = sysRoleDeptService.queryDeptIdList(roleId);
//		role.setDeptIdList(deptIdList);
//
//		return R.ok().put("role", role);
//	}

	
	/**
	 * 修改角色
	 */
	@SysLog("修改角色")
	@RequestMapping("/update")
	//@RequiresPermissions("sys:role:update")
	public R update(@RequestBody EmpSalaryEntity salary){
		ValidatorUtils.validateEntity(salary);

		salaryService.update(salary);
		return R.ok();
	}

}
