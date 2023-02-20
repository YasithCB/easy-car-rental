package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.service.ReservationDetailsService;
import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 5:13 PM
 * project back-end-spring
 */

@RestController
@CrossOrigin
@RequestMapping("reservation_controller")
public class ReservationDetailsController {

    @Autowired
    private ReservationDetailsService service;

    @GetMapping
    public ResponseUtil getAllReservationDetails(){
        return new ResponseUtil("200","", service.getAllReservationDetails());
    }
}
