package kuroneko.fun.system.platform.nacos.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @RequestMapping("/hello1")
  public String hello() {
    return "Hello， I am a producer-one ";
  }
}
