package kuroneko.fun.system.platform.consul.consumer.feign.hystrix;

import kuroneko.fun.system.platform.consul.consumer.feign.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements HelloService {

  @Override
  public String hello() {
    return "bad request,hystrix !";
  }
}
