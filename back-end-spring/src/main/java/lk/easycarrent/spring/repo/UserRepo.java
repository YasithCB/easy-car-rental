package lk.easycarrent.spring.repo;

import lk.easycarrent.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 5:48 PM
 * project back-end-spring
 */

public interface UserRepo extends JpaRepository<User,Long> {
}
