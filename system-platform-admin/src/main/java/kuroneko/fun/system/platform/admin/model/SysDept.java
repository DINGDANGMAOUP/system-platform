package kuroneko.fun.system.platform.admin.model;

import java.util.List;
import lombok.Data;

/** @author kuroneko */
@Data
public class SysDept extends BaseModel {

  private String name;

  private Long parentId;

  private Integer orderNum;

  private Byte delFlag;

  private List<SysDept> children;

  // 非数据库字段
  private String parentName;
  // 非数据库字段
  private Integer level;
}
