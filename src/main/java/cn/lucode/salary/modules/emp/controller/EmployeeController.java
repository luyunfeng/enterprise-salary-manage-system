package cn.lucode.salary.modules.emp.controller;

import cn.lucode.salary.common.annotation.SysLog;
import cn.lucode.salary.common.utils.Constant;
import cn.lucode.salary.common.utils.PageUtils;
import cn.lucode.salary.common.utils.Query;
import cn.lucode.salary.common.utils.R;
import cn.lucode.salary.common.validator.ValidatorUtils;
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
 * 员工管理
 */
@RestController
@RequestMapping("/emp/employee")
public class EmployeeController extends AbstractController {
	@Autowired
	private SysRoleService sysRoleService;
	@Autowired
	private SysRoleDeptService sysRoleDeptService;

	/**
	 * 员工列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("emp:employee:list")
	public R list(@RequestParam Map<String, Object> params){
		//如果不是超级管理员，则只查询自己创建的员工列表
		if(getUserId() != Constant.SUPER_ADMIN){
			params.put("createUserId", getUserId());
		}

		//查询列表数据
		Query query = new Query(params);
		List<SysRoleEntity> list = sysRoleService.queryList(query);
		// 分页
		int total = sysRoleService.queryTotal(query);

		PageUtils pageUtil = new PageUtils(list, total, query.getLimit(), query.getPage());

		return R.ok().put("page", pageUtil);
	}

	/**
	 * 角色列表
	 */
	@RequestMapping("/select")
	@RequiresPermissions("sys:role:select")
	public R select(){
		Map<String, Object> map = new HashMap<>();

		//如果不是超级管理员，则只查询自己所拥有的角色列表
		if(getUserId() != Constant.SUPER_ADMIN){
			map.put("createUserId", getUserId());
		}
		List<SysRoleEntity> list = sysRoleService.queryList(map);

		return R.ok().put("list", list);
	}

//	/**
//	 * 角色信息
//	 */
//	@RequestMapping("/info/{roleId}")
//	@RequiresPermissions("sys:role:info")
//	public R info(@PathVariable("roleId") Long roleId){
//		SysRoleEntity role = sysRoleService.queryObject(roleId);
//
//		//查询角色对应的部门
//		List<Long> deptIdList = sysRoleDeptService.queryDeptIdList(roleId);
//		role.setDeptIdList(deptIdList);
//
//		return R.ok().put("role", role);
//	}

	/**
	 * 保存角色
	 */
	@SysLog("保存角色")
	@RequestMapping("/save")
	@RequiresPermissions("sys:role:save")
	public R save(@RequestBody SysRoleEntity role){
		ValidatorUtils.validateEntity(role);

		sysRoleService.save(role);

		return R.ok();
	}

	/**
	 * 修改角色
	 */
	@SysLog("修改角色")
	@RequestMapping("/update")
	@RequiresPermissions("sys:role:update")
	public R update(@RequestBody SysRoleEntity role){
		ValidatorUtils.validateEntity(role);

		sysRoleService.update(role);

		return R.ok();
	}

//	/**
//	 * 删除角色
//	 */
//	@SysLog("删除角色")
//	@RequestMapping("/delete")
//	@RequiresPermissions("sys:role:delete")
//	public R delete(@RequestBody Long[] roleIds){
//		sysRoleService.deleteBatch(roleIds);
//
//		return R.ok();
//	}
}
