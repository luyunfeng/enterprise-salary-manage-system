package cn.lucode.salary.modules.job.dao;


import cn.lucode.salary.modules.job.entity.ScheduleJobLogEntity;
import cn.lucode.salary.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志

 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
