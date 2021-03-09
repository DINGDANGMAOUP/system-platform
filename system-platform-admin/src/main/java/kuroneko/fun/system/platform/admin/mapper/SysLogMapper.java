package kuroneko.fun.system.platform.admin.mapper;

import java.util.List;
import kuroneko.fun.system.platform.admin.model.SysLog;
import org.apache.ibatis.annotations.Param;

/**
 * @author kuroneko
 */
public interface SysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
    
    List<SysLog> findPage();
    
    List<SysLog> findPageByUserName(@Param(value="userName") String userName);
}