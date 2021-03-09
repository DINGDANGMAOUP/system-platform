package kuroneko.fun.system.platform.admin.model;

import java.util.Date;
import lombok.Data;


/**
 * @author kuroneko
 */
@Data
public class BaseModel {

	private Long id;
	
    private String createBy;

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;


}
