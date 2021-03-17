package kuroneko.fun.system.platform.nacos.producer.service.impl;

import kuroneko.fun.system.platform.nacos.producer.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/** @author kuroneko */
@Component
@DubboService(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

  @Override
  public String hello1() {
    return "Hello， I am a producer-one ";
  }
}
