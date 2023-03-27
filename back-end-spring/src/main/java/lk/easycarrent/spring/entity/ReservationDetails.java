package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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
@Entity(name = "reservation_details")
@IdClass(ReservationDetailsKey.class)
public class ReservationDetails {
    @Id
    private Long reserveId;
    @Id
    private Long carId;
    @Id
    private Long driverId;

    private LocalDate pickupDate;
    private String pickupLocation;
    private LocalDate finishDate;
    private String finishLocation;
    private Double lossDamagePayment;

    @ManyToOne
    @JoinColumn(name = "reservationId", referencedColumnName = "id", updatable = false, insertable = false)
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "carId", referencedColumnName = "id", updatable = false, insertable = false)
    private Car car;

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "driverId", referencedColumnName = "id", insertable = false, updatable = false, nullable = true)
    private Driver driver;

}
