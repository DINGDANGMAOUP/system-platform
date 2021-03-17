package kuroneko.fun.system.platform.nacos.consumer.controller;

import kuroneko.fun.system.platform.nacos.consumer.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author kuroneko */
@RestController
@RequestMapping("test")
public class HelloController {
  @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:20883")
  HelloService helloService;

  @RequestMapping("/test1")
  public String test1() {
    return helloService.hello1();
  }

  //  @GetMapping("/test2")
  //  public String test2(){
  //    return helloService.hello2();
  //  }

}
