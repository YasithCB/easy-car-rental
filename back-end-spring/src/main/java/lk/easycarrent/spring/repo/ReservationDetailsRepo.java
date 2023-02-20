package lk.easycarrent.spring.repo;

import lk.easycarrent.spring.entity.ReservationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 5:18 PM
 * project back-end-spring
 */

public interface ReservationDetailsRepo extends JpaRepository<ReservationDetails,Long> {
}
