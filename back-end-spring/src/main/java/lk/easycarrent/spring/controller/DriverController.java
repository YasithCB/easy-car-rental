package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.DriverDTO;
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

    @PostMapping
    public ResponseUtil saveDriver(DriverDTO dto){
        service.saveDriver(dto);
        return new ResponseUtil("200", "driver "+dto.getName()+" saved", dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteDriver(String id){
        service.deleteCustomer(id);
        return new ResponseUtil("200" , "driver "+id+" deleted", id);
    }

    @PutMapping
    public ResponseUtil updateDriver(@RequestBody DriverDTO dto){
        service.updateDriver(dto);
        return new ResponseUtil("200", "driver "+dto.getName()+"'s details updated", dto);
    }

}
