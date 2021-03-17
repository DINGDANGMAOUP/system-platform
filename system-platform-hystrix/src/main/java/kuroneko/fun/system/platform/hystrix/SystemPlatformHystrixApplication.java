package kuroneko.fun.system.platform.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/** @author kuroneko */
@EnableTurbine
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class SystemPlatformHystrixApplication {

  public static void main(String[] args) {
    SpringApplication.run(SystemPlatformHystrixApplication.class, args);
  }
}
