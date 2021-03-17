package kuroneko.fun.system.platform.admin.model;

import lombok.Data;

/** @author kuroneko */
@Data
public class SysRole extends BaseModel {

  private String name;

  private String remark;

  private Byte delFlag;
}
