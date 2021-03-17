package kuroneko.fun.system.platform.admin.mapper;

import kuroneko.fun.system.platform.admin.model.SysRoleDept;

/** @author kuroneko */
public interface SysRoleDeptMapper {
  int deleteByPrimaryKey(Long id);

  int insert(SysRoleDept record);

  int insertSelective(SysRoleDept record);

  SysRoleDept selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(SysRoleDept record);

  int updateByPrimaryKey(SysRoleDept record);
}
