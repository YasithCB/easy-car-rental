package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.ReservationDetails;
import lk.easycarrent.spring.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 11:12 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DriverDTO {
    private Long id;
    private String name;
    private String contact;
    private String email;
    private String address;

    private List<ReservationDetails> reservationDetailsList;
    private Schedule schedule;
}
