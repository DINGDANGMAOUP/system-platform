package kuroneko.fun.system.platform.admin.mapper;

import java.util.List;
import kuroneko.fun.system.platform.admin.model.SysRole;
import org.apache.ibatis.annotations.Param;

/**
 * @author kuroneko
 */
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    List<SysRole> findPage();

	List<SysRole> findAll();
	
	List<SysRole> findPageByName(@Param(value="name") String name);
	
	List<SysRole> findByName(@Param(value="name") String name);
}