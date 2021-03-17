package kuroneko.fun.system.platform.admin.mapper;

import java.util.List;
import kuroneko.fun.system.platform.admin.model.SysDept;

/** @author kuroneko */
public interface SysDeptMapper {
  int deleteByPrimaryKey(Long id);

  int insert(SysDept record);

  int insertSelective(SysDept record);

  SysDept selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(SysDept record);

  int updateByPrimaryKey(SysDept record);

  List<SysDept> findPage();

  List<SysDept> findAll();
}
