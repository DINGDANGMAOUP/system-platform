package kuroneko.fun.system.platform.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * SPA会从注册中心拉去实例列表监控，client无需在手动注册至 SAP server 但是需要配置actuator
 *
 * @author kuroneko
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
@EnableFeignClients
public class SystemPlatformMonitorApplication {

  public static void main(String[] args) {
    SpringApplication.run(SystemPlatformMonitorApplication.class, args);
  }
}
