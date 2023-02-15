package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 1:25 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Payment {
    @Id
    private Long id;
    private LocalDate date;
    private Double value;
}
