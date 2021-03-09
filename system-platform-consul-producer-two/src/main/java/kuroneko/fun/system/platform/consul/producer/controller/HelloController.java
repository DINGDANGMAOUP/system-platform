package kuroneko.fun.system.platform.consul.producer.controller;

import javax.annotation.Resource;
import kuroneko.fun.system.platform.consul.producer.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @Resource
  HelloService helloService;
  @RequestMapping("/hello2")
  public String hello2(){
    return helloService.hello2();
  }
}
