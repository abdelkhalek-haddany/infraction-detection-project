package haddany.abdelkhalek.infractionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InfractionServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfractionServiceApplication.class, args);
    }
}
