package kuroneko.fun.system.platform.producer.service.impl;

import kuroneko.fun.system.platform.producer.service.HelloService;
import org.springframework.stereotype.Component;

/**
 *
 * @author kuroneko
 */
@Component
public class HelloServiceImpl implements HelloService {

  @Override
  public String hello2() {
    return "Hello， this is producer-two ";
  }
}
