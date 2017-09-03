package cn.lucode.salary.modules.sys.service;


import cn.lucode.salary.common.utils.R;
import cn.lucode.salary.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token

 */
public interface SysUserTokenService {

	SysUserTokenEntity queryByUserId(Long userId);

	SysUserTokenEntity queryByToken(String token);
	
	void save(SysUserTokenEntity token);
	
	void update(SysUserTokenEntity token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

}
