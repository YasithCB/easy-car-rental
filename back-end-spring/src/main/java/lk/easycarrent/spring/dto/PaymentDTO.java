package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 1:24 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentDTO {
    private Long id;
    private LocalDate date;
    private Double value;
    private Reservation reservation;
}
