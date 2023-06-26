package haddany.abdelkhalek.infractionservice.repositories;

import haddany.abdelkhalek.infractionservice.entites.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction, Long> {
}
