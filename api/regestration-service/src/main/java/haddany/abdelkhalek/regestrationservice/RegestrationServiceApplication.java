package haddany.abdelkhalek.regestrationservice;

import haddany.abdelkhalek.regestrationservice.entites.Owner;
import haddany.abdelkhalek.regestrationservice.entites.Vehicle;
import haddany.abdelkhalek.regestrationservice.repositories.OwnerRepository;
import haddany.abdelkhalek.regestrationservice.repositories.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;
@SpringBootApplication
public class RegestrationServiceApplication {

    Random random = new Random();

    public static void main(String[] args) {
        SpringApplication.run(RegestrationServiceApplication.class, args);
    }

    // Add data to H2 database in start of application
    @Bean
    CommandLineRunner start(VehicleRepository vehicleRepository, OwnerRepository ownerRepository) {
        return args -> {
            Stream.of("Abdelkhalek Haddany", "Mohammed Elyoussfi", "Ali bikri",
                    "Ali oubelkasem", "Mohamed ouanan").forEach(o -> {

                String em = o.replaceAll(" ","");
                Owner owner = Owner.builder()
                        .name(o)
                        .email(em+ "@gmail.com")
                        .birthDate(new Date())
                        .build();
                ownerRepository.save(owner);
            });

            ownerRepository.findAll().forEach(owner -> {
                for (int i = 0; i < 2; i++) {
                    Vehicle vehicle = Vehicle.builder()
                            .regestrationNumber(UUID.randomUUID().toString())
                            .fiscalPower(Double.valueOf(random.nextInt(1000)))
                            .brand("brand" + random.nextInt(20))
                            .model("model" + random.nextInt(20))
                            .owner(owner)
                            .build();
                    vehicleRepository.save(vehicle);
                }
            });

        };
    }
}
