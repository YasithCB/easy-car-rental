package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 12:14 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String regNo;
    private String brand;
    private String color;
    private String imageFront;
    private String imageBack;
    private String imageSide;
    private String imageInterior;
    private Boolean isAvailable;
    private LocalDate availableDate;
    private String transmissionType;
    private String fuelType;
    private String carType;
    private Double freeMileage;
    private Double chargeForExtraKm;
    private Double dailyRate;
    private Double monthlyRate;
    private Integer yom;
    private Integer kmPerLitre;
}
