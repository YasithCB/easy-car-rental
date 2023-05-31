package lk.easycarrent.spring.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 3:13 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationDTO {
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
