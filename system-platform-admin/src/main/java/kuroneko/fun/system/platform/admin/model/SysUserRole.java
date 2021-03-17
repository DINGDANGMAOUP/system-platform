package kuroneko.fun.system.platform.admin.model;

import lombok.Data;

/** @author kuroneko */
@Data
public class SysUserRole extends BaseModel {

  private Long userId;

  private Long roleId;
}
