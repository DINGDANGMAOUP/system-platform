package kuroneko.fun.system.platform.admin.model;

import lombok.Data;

/**
 * @author kuroneko
 */
@Data
public class SysLog extends BaseModel {

    private String userName;

    private String operation;

    private String method;

    private String params;

    private Long time;

    private String ip;



}