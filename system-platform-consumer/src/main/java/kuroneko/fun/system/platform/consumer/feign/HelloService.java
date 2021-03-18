package kuroneko.fun.system.platform.consumer.feign;

import kuroneko.fun.system.platform.consumer.feign.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * openFeign远程调用示例，调用system-platform-consul-producer的hello接口,fallback实现熔断操作，openFeign已实现ribbon负责均衡，无需自实现
 *
 * @author kuroneko
 */
@FeignClient(value = "system-platform-producer", fallback = HelloHystrix.class)
public interface HelloService {

  @RequestMapping("/hello")
  String hello();
}
