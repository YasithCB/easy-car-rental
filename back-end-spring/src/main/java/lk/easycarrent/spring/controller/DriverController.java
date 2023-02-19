package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.service.DriverService;
import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 11:08 PM
 * project back-end-spring
 */

@RestController
@CrossOrigin
@RequestMapping("driver")
public class DriverController {

    @Autowired
    private DriverService service;

    @GetMapping
    public ResponseUtil getAllDrivers(){
        return new ResponseUtil("200","", service.getAllDrivers());
    }



}
