package kuroneko.fun.system.platform.conusl.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SystemPlatformConsulProducerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemPlatformConsulProducerOneApplication.class, args);
    }

}
