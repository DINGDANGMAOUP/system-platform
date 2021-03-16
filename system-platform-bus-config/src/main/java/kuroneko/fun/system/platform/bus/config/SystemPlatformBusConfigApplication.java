package kuroneko.fun.system.platform.bus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author kuroneko
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class SystemPlatformBusConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemPlatformBusConfigApplication.class, args);
    }

}
