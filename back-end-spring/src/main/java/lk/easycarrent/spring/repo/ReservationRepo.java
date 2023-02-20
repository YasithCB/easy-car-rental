package lk.easycarrent.spring.repo;

import lk.easycarrent.spring.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 3:51 PM
 * project back-end-spring
 */

public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
