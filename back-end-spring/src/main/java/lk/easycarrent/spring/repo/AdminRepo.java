package lk.easycarrent.spring.repo;

import lk.easycarrent.spring.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 10:03 PM
 * project back-end-spring
 */

public interface AdminRepo extends JpaRepository<Admin,Long> {
}
