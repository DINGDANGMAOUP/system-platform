package kuroneko.fun.system.platform.consul.consumer.controller;

import javax.annotation.Resource;
import kuroneko.fun.system.platform.consul.consumer.feign.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kuroneko
 */
@RestController
public class HelloController {

  @Resource
  HelloService helloService;
  @RequestMapping("/hello")
  public String hello(){
    return  helloService.hello();
  }

}
