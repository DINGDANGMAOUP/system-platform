package kuroneko.fun.system.platform.admin.mapper;

import java.util.List;
import kuroneko.fun.system.platform.admin.model.SysDict;
import org.apache.ibatis.annotations.Param;

/**
 * @author kuroneko
 */
public interface SysDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
    
    List<SysDict> findPage();
    
    List<SysDict> findPageByLabel(@Param(value="label") String label);

    List<SysDict> findByLable(@Param(value="label") String label);
}