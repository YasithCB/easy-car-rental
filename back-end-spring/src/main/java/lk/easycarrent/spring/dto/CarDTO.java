package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.ReservationDetails;
import lk.easycarrent.spring.enums.CarType;
import lk.easycarrent.spring.enums.Color;
import lk.easycarrent.spring.enums.FuelType;
import lk.easycarrent.spring.enums.TransmissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 1:47 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarDTO {
    private Long id;
    private String regNo;
    private String brand;
    private Color color;
    private String imageFront;
    private String imageBack;
    private String imageSide;
    private String imageInterior;
    private Boolean isAvailable;
    private LocalDate availableDate;
    private TransmissionType transmissionType;
    private FuelType fuelType;
    private CarType carType;
    private Double freeMileage;
    private Double chargeForExtraKm;
    private Double dailyRate;
    private Double monthlyRate;

    private List<ReservationDetails> reservationDetailsList;
}
