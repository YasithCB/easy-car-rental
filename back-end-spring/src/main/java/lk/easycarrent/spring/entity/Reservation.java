package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 1:27 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long carId;
    private Long driverId;

    private LocalDate finishDate;
    private String finishLocation;
    private String lossDamageSlip;

    private LocalDate pickupDate;
    private String pickupLocation;
    private Long reserveId;

    private LocalDate reserveDate;
    private Long userId;
    private boolean isApproved;
}
