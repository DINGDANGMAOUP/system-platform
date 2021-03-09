package kuroneko.fun.system.platform.consul.consumer.controller;

import javax.annotation.Resource;
import kuroneko.fun.system.platform.consul.consumer.feign.HelloOneService;
import kuroneko.fun.system.platform.consul.consumer.feign.HelloTwoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kuroneko
 */
@RestController
public class HelloController {

  @Resource
  HelloOneService helloOneService;
  @Resource
  HelloTwoService helloTwoService;
  @RequestMapping("/hello1")
  public String hello1(){
    return helloOneService.hello1();
  }
  @RequestMapping("/hello2")
  public String hello2(){
    return helloTwoService.hello2();
  }
}
