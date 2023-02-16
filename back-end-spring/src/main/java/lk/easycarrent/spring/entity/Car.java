package lk.easycarrent.spring.entity;

import lk.easycarrent.spring.dto.CarType;
import lk.easycarrent.spring.dto.Color;
import lk.easycarrent.spring.dto.FuelType;
import lk.easycarrent.spring.dto.TransmissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<ReservationDetails> reservationDetailsList;

    public Car(String regNo, String brand, Color color, byte[] image, Boolean isAvailable, LocalDate availableDate, TransmissionType transmissionType, FuelType fuelType, CarType carType, Double freeMileage, Double chargeForExtraKm, Double dailyRate, Double monthlyRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.color = color;
        this.image = image;
        this.isAvailable = isAvailable;
        this.availableDate = availableDate;
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.carType = carType;
        this.freeMileage = freeMileage;
        this.chargeForExtraKm = chargeForExtraKm;
        this.dailyRate = dailyRate;
        this.monthlyRate = monthlyRate;
    }
}
