package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.CarDTO;
import lk.easycarrent.spring.entity.Car;
import lk.easycarrent.spring.repo.CarRepo;
import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 1:41 PM
 * project back-end-spring
 */

@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarRepo repo;

    @GetMapping
    public String getAllCars(){
        System.out.println("get invoked");
        return "get invoked";
    }

    @PostMapping
    public ResponseUtil saveCar(@ModelAttribute CarDTO dto){
        repo.save(new Car(
                dto.getRegNo(),
                dto.getBrand(),
                dto.getColor(),
                dto.getImage(),
                dto.getIsAvailable(),
                dto.getAvailableDate(),
                dto.getTransmissionType(),
                dto.getFuelType(),
                dto.getCarType(),
                dto.getFreeMileage(),
                dto.getChargeForExtraKm(),
                dto.getDailyRate(),
                dto.getMonthlyRate()
        ));
        return new ResponseUtil("200","Car Saved",null);
    }
}
