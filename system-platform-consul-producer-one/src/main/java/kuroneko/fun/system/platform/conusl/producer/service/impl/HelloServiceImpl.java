package kuroneko.fun.system.platform.conusl.producer.service.impl;

import kuroneko.fun.system.platform.conusl.producer.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author kuroneko
 */
@Component
public class HelloServiceImpl implements HelloService {

  @Override
  public String hello1() {
    return "Hello， I am a producer-one ";
  }
}
