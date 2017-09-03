package cn.lucode.salary.modules.job.dao;


import cn.lucode.salary.modules.job.entity.ScheduleJobEntity;
import cn.lucode.salary.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务

 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
