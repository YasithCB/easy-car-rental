package lk.easycarrent.spring.repo;

import lk.easycarrent.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 11:10 PM
 * project back-end-spring
 */

public interface DriverRepo extends JpaRepository<Driver,Long> {
}
