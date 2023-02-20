package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.service.ReservationService;
import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 3:12 PM
 * project back-end-spring
 */
@RestController
@CrossOrigin
@RequestMapping("reservation")
public class ReservationController {

    @Autowired
    private ReservationService service;

    @GetMapping
    public ResponseUtil getAllReservations(){
        return new ResponseUtil("200","",service.getAllReservations());
    }
}
