package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Payment;
import lk.easycarrent.spring.entity.ReservationDetails;
import lk.easycarrent.spring.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

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
    private LocalDate date;
    private User user;
    private List<Payment> paymentList;
    private List<ReservationDetails> reservationDetailsList;
}
