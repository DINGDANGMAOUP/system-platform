package kuroneko.fun.system.platform.consul.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * SPA会从注册中心拉去实例列表监控，client无需在手动注册至 SAP server
 * @author kuroneko
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
@EnableFeignClients
public class SystemPlatformConsulMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemPlatformConsulMonitorApplication.class, args);
    }

}
