package kuroneko.fun.system.platform.monitor.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author kuroneko
 */
@Component
@Data
@ConfigurationProperties(prefix = "notify.dingtalk")
public class DingTalkDataSourceProperties {
    private String webhook;
}
