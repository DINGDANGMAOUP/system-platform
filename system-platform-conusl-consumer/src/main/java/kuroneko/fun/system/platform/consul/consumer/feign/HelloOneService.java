package kuroneko.fun.system.platform.consul.consumer.feign;

import kuroneko.fun.system.platform.consul.consumer.feign.hystrix.HelloOneHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kuroneko
 */

@FeignClient(value = "system-platform-consul-producer-one",fallback = HelloOneHystrix.class)
public interface HelloOneService {
  @RequestMapping("/hello1")
   String hello1();
}
