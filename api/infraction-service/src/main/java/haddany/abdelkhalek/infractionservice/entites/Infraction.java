package haddany.abdelkhalek.infractionservice.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import haddany.abdelkhalek.infractionservice.models.Radar;
import haddany.abdelkhalek.infractionservice.models.Vehicle;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;

    private boolean paid;
    private Long radarId;
    private String vehicleMatricule;
    @Transient // pour cacher les attr a client
    private Vehicle vehicle;
    private double vehicleSpeed;

    @Transient
    private Radar radar;
    private double radarMaxSpeed;
    private double infractionAmount;
}
