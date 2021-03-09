package kuroneko.fun.system.platform.consul.consumer.feign;

import kuroneko.fun.system.platform.consul.consumer.feign.hystrix.HelloTwoHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author kuroneko
 */
@FeignClient(value = "system-platform-consul-producer-two",fallback = HelloTwoHystrix.class)
public interface HelloTwoService {
  @RequestMapping("/hello2")
  String hello2();
}
