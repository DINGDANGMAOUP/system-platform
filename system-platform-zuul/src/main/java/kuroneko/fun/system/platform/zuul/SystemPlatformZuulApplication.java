package kuroneko.fun.system.platform.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/** @author kuroneko */
@SpringBootApplication
@EnableZuulProxy
public class SystemPlatformZuulApplication {

  public static void main(String[] args) {
    SpringApplication.run(SystemPlatformZuulApplication.class, args);
  }
}
