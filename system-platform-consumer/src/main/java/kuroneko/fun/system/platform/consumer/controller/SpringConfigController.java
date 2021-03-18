package kuroneko.fun.system.platform.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // 加上该注解后 通过post请求  /actuator/refresh 刷新yml配置文件
@RestController
class SpringConfigController {

  @Value("${consumer.hello}")
  private String hello;

  @RequestMapping("bus/hello")
  public String from() {
    return this.hello;
  }
}
