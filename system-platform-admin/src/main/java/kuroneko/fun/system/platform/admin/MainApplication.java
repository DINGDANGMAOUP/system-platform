package kuroneko.fun.system.platform.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kuroneko
 */
@SpringBootApplication(scanBasePackages={"kuroneko.fun.system.platform"})
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
