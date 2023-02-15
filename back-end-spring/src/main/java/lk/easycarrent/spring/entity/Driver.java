package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 1:08 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Driver {
    @Id
    private Long id;
    private String name;
    private String contact;
    private String email;
    private String address;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<ReservationDetails> reservationDetailsList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scheduleId", referencedColumnName = "id")
    private Schedule schedule;
}
