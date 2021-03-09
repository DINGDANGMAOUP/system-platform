package kuroneko.fun.system.platform.nacos.producer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kuroneko
 */
@EnableDubbo
@SpringBootApplication
public class SystemPlatformNacosProducerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemPlatformNacosProducerOneApplication.class, args);
    }

}
