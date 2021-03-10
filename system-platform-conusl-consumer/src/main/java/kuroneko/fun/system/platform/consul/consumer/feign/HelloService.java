package kuroneko.fun.system.platform.consul.consumer.feign;

import kuroneko.fun.system.platform.consul.consumer.feign.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kuroneko
 */
@FeignClient(value = "system-platform-consul-producer",fallback = HelloHystrix.class)
public interface HelloService {

   @RequestMapping("/hello")
   String hello();
}
