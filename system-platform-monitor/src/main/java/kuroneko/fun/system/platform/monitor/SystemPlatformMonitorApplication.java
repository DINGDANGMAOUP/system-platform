package kuroneko.fun.system.platform.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kuroneko
 */
@SpringBootApplication
@EnableAdminServer
public class SystemPlatformMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemPlatformMonitorApplication.class, args);
    }

}
