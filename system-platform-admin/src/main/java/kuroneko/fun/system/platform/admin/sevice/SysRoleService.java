package kuroneko.fun.system.platform.admin.sevice;

import java.util.List;
import kuroneko.fun.system.platform.admin.model.SysMenu;
import kuroneko.fun.system.platform.admin.model.SysRole;
import kuroneko.fun.system.platform.admin.model.SysRoleMenu;
import kuroneko.fun.system.platform.core.service.CurdService;

/**
 * 角色管理
 *
 * @author kuroneko
 */
public interface SysRoleService extends CurdService<SysRole> {

  /**
   * 查询全部
   *
   * @return
   */
  List<SysRole> findAll();

  /**
   * 查询角色菜单集合
   *
   * @return
   */
  List<SysMenu> findRoleMenus(Long roleId);

  /**
   * 保存角色菜单
   *
   * @param records
   * @return
   */
  int saveRoleMenus(List<SysRoleMenu> records);

  /**
   * 根据名称查询
   *
   * @param name
   * @return
   */
  List<SysRole> findByName(String name);
}
