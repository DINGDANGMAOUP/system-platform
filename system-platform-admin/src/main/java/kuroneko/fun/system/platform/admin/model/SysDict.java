package kuroneko.fun.system.platform.admin.model;

import lombok.Data;

/** @author kuroneko */
@Data
public class SysDict extends BaseModel {

  private String value;

  private String label;

  private String type;

  private String description;

  private Long sort;

  private String remarks;

  private Byte delFlag;
}
