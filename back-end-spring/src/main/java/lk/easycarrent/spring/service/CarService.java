package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.CarDTO;

import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 9:05 PM
 * project back-end-spring
 */

public interface CarService {
    void saveCar(CarDTO dto);

    void deleteCar(Long id);

    void updateCar(CarDTO dto);

    ArrayList<CarDTO> getAllCars();
}
