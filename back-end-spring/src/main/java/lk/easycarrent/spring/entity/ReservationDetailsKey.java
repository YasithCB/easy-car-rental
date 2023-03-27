package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * author  Yasith C Bandara
 * created 3/27/2023 - 4:49 PM
 * project back-end-spring
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ReservationDetailsKey implements Serializable {
    private Long reserveId;
    private Long carId;
    private Long driverId;
}
