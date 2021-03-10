package kuroneko.fun.system.platform.conusl.producer.controller;

import javax.annotation.Resource;
import kuroneko.fun.system.platform.conusl.producer.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @Resource
  HelloService helloService;
  @RequestMapping("/hello")
  public String hello(){
    return helloService.hello1();
  }
}