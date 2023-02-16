package lk.easycarrent.spring.repo;

import lk.easycarrent.spring.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 1:44 PM
 * project back-end-spring
 */

public interface CarRepo extends JpaRepository<Car,Long> {
}
