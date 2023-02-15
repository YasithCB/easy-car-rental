package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 2:03 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ReservationDetails {
    @Id
    private Long id;

    private LocalDate pickupDate;
    private String pickupLocation;
    private LocalDate finishDate;
    private String finishLocation;

    @ManyToOne
    @JoinColumn(name = "reservationId", referencedColumnName = "id")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "carId", referencedColumnName = "id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "driverId", referencedColumnName = "id")
    private Driver driver;

}
