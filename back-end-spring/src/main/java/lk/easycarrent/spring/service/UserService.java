package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.UserDTO;

import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 8:47 PM
 * project back-end-spring
 */

public interface UserService {
    void saveUser(UserDTO dto);

    ArrayList<UserDTO> getAllUsers();

    UserDTO getUserById(Long id);

    void deleteUser(String id);

    void updateUser(UserDTO dto);
}
