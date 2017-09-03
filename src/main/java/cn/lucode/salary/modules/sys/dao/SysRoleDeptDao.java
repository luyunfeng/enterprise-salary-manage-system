package cn.lucode.salary.modules.sys.dao;

import cn.lucode.salary.modules.sys.entity.SysRoleDeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 员工与部门对应关系
 */
@Mapper
public interface SysRoleDeptDao extends BaseDao<SysRoleDeptEntity> {
	
	/**
	 * 根据员工ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long roleId);
}
