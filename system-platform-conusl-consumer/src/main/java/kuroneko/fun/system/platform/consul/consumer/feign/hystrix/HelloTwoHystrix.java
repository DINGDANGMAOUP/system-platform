package kuroneko.fun.system.platform.consul.consumer.feign.hystrix;

import kuroneko.fun.system.platform.consul.consumer.feign.HelloTwoService;
import org.springframework.stereotype.Component;

@Component
public class HelloTwoHystrix implements HelloTwoService {

  @Override
  public String hello2() {
    return "ok";
  }
}
