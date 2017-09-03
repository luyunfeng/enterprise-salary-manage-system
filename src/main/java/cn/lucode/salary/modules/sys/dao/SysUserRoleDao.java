package cn.lucode.salary.modules.sys.dao;


import cn.lucode.salary.modules.sys.entity.SysUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *  管理员和员工的关系
 */
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取员工ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}
