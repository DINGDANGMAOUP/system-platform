package kuroneko.fun.system.platform.monitor.config;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import javax.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kuroneko
 */
@Configuration
public class DingTalkConfig {

  @Resource
  DingTalkDataSourceProperties dingTalkDataSourceProperties;

  @Bean
  DingTalkClient DingTalkClient() {
    return new DefaultDingTalkClient(dingTalkDataSourceProperties.getWebhook());
  }

  @Bean
  OapiRobotSendRequest OapiRobotSendRequest() {
    return new OapiRobotSendRequest();
  }
  @Bean
  OapiRobotSendRequest.Text Text(){
    return new OapiRobotSendRequest.Text();
  }
  @Bean
  OapiRobotSendRequest.Link Link(){
    return new OapiRobotSendRequest.Link();
  }
  @Bean
  OapiRobotSendRequest.Markdown Markdown(){
    return new OapiRobotSendRequest.Markdown();
  }
}
