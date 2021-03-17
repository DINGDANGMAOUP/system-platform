package kuroneko.fun.system.platform.admin.sevice;

import java.util.List;
import kuroneko.fun.system.platform.admin.model.SysDict;
import kuroneko.fun.system.platform.core.service.CurdService;

/**
 * 字典管理
 *
 * @author kuroneko
 */
public interface SysDictService extends CurdService<SysDict> {

  /**
   * 根据名称查询
   *
   * @param lable
   * @return
   */
  List<SysDict> findByLable(String lable);
}
