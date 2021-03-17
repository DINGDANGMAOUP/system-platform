package kuroneko.fun.system.platform.nacos.producer.service.impl;

import kuroneko.fun.system.platform.nacos.producer.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/** @author kuroneko */
@Component
@DubboService
public class HelloServiceImpl implements HelloService {

  @Override
  public String hello() {
    return "Hello， I am a producer-two ";
  }
}
