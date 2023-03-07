package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.CarDTO;
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
    public ResponseUtil getAllCars() {
        return new ResponseUtil("200", "", service.getAllCars());
    }

    @GetMapping(path = "/byId", params = "id")
    public ResponseUtil getCarById(Long id) {
        return new ResponseUtil("200", "", service.getCarById(id));
    }

    @PostMapping
    public ResponseUtil saveCar(@RequestBody CarDTO dto) {
        service.saveCar(dto);
        return new ResponseUtil("200", "Car Saved", dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCar(Long id) {
        service.deleteCar(id);
        return new ResponseUtil("200", id+" car deleted",null);
    }

    @PutMapping
    public ResponseUtil updateCar(@RequestBody CarDTO dto){
        service.updateCar(dto);
        return new ResponseUtil("200","car details updated",dto);
    }
}
