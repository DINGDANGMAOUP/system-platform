package kuroneko.fun.system.platform.admin.sevice;


import java.util.List;
import java.util.Set;
import kuroneko.fun.system.platform.admin.model.SysUser;
import kuroneko.fun.system.platform.admin.model.SysUserRole;
import kuroneko.fun.system.platform.core.service.CurdService;

/**
 * 用户管理
 * @author kuroneko
 */
public interface SysUserService extends CurdService<SysUser> {

	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * @param userId
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

}
