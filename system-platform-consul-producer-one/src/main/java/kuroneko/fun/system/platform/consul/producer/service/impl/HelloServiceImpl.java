package kuroneko.fun.system.platform.consul.producer.service.impl;

import kuroneko.fun.system.platform.consul.producer.service.HelloService;
import org.springframework.stereotype.Component;

/** @author kuroneko */
@Component
public class HelloServiceImpl implements HelloService {

  @Override
  public String hello1() {
    return "Hello， this is producer-one ";
  }
}
