package sid.org.serviceconfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServiceConfgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfgApplication.class, args);
    }

}

