package kuroneko.fun.system.platform.admin.sevice;

import java.util.List;
import kuroneko.fun.system.platform.admin.model.SysDept;
import kuroneko.fun.system.platform.core.service.CurdService;

/**
 * 机构管理
 *
 * @author kuroneko
 */
public interface SysDeptService extends CurdService<SysDept> {

  /**
   * 查询机构树
   *
   * @return
   */
  List<SysDept> findTree();
}
