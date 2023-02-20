package lk.easycarrent.spring.repo;

import lk.easycarrent.spring.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 1:26 PM
 * project back-end-spring
 */

public interface PaymentRepo extends JpaRepository<Payment,Long> {
}
