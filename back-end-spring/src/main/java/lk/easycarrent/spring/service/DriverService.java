package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.DriverDTO;

import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 11:14 PM
 * project back-end-spring
 */

public interface DriverService {
    void saveDriver(DriverDTO dto);

    ArrayList<DriverDTO> getAllDrivers();

    void deleteCustomer(String id);
}
