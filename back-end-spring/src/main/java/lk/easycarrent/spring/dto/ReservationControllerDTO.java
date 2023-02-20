package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Car;
import lk.easycarrent.spring.entity.Driver;
import lk.easycarrent.spring.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 5:14 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationControllerDTO {
    private Long id;
    private LocalDate pickupDate;
    private String pickupLocation;
    private LocalDate finishDate;
    private String finishLocation;
    private Reservation reservation;
    private Car car;
    private Driver driver;
}
