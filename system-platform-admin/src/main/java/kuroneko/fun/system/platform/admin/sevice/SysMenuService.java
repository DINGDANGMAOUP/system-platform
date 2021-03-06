package kuroneko.fun.system.platform.admin.sevice;

import java.util.List;
import kuroneko.fun.system.platform.admin.model.SysMenu;
import kuroneko.fun.system.platform.core.service.CurdService;

/**
 * 菜单管理
 * @author kuroneko
 */
public interface SysMenuService extends CurdService<SysMenu> {

	/**
	 * 查询菜单树,用户ID和用户名为空则查询全部
	 * @param menuType 获取菜单类型，0：获取所有菜单，包含按钮，1：获取所有菜单，不包含按钮
	 * @param userName
	 * @return
	 */
	List<SysMenu> findTree(String userName, int menuType);

	/**
	 * 根据用户名查找菜单列表
	 * @param userName
	 * @return
	 */
	List<SysMenu> findByUser(String userName);
}
