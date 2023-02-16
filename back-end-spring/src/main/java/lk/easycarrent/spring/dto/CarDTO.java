package lk.easycarrent.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import java.time.LocalDate;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 1:47 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CarDTO {
    private Long id;
    private String regNo;
    private String brand;
    private Color color;
    private byte[] image;
    private Boolean isAvailable;
    private LocalDate availableDate;
    private TransmissionType transmissionType;
    private FuelType fuelType;
    private CarType carType;
    private Double freeMileage;
    private Double chargeForExtraKm;
    private Double dailyRate;
    private Double monthlyRate;
}
