package lk.easycarrent.spring.controller;

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
    private CarRepo carRepo;

    @PostMapping
    public ResponseUtil saveCar(){
        return new ResponseUtil();
    }

}
