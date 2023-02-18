package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.CarDTO;
import lk.easycarrent.spring.entity.Car;
import lk.easycarrent.spring.repo.CarRepo;
import lk.easycarrent.spring.service.CarService;
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
    private CarService service;

    @GetMapping
    public String getAllCars(){
        System.out.println("get invoked");
        return "get invoked";
    }

    @PostMapping
    public ResponseUtil saveCar(@ModelAttribute CarDTO dto){
        service.saveCar(dto);
        return new ResponseUtil("200","Car Saved",dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCar(Long id){
        service.deleteCar(id);
        return new ResponseUtil("200", id+" car deleted",null);
    }

    @PutMapping
    public ResponseUtil updateCar(@RequestBody CarDTO dto){
        service.updateCar(dto);
        return new ResponseUtil("200","car details updated",dto);
    }
}
