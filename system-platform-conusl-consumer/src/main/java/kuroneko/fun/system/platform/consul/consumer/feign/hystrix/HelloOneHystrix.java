package kuroneko.fun.system.platform.consul.consumer.feign.hystrix;

import kuroneko.fun.system.platform.consul.consumer.feign.HelloOneService;
import org.springframework.stereotype.Component;

@Component
public class HelloOneHystrix implements HelloOneService {

  @Override
  public String hello1() {
    return "ok";
  }
}
