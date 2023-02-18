package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.dto.CarDTO;
import lk.easycarrent.spring.entity.Car;
import lk.easycarrent.spring.repo.CarRepo;
import lk.easycarrent.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 9:05 PM
 * project back-end-spring
 */

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private CarRepo repo;

    @Override
    public void saveCar(CarDTO dto) {
        repo.save(mapper.map(dto,Car.class));
    }

    @Override
    public void deleteCar(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void updateCar(CarDTO dto) {
        repo.save(mapper.map(dto,Car.class));
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }
}
