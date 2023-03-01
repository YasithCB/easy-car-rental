package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.ReservationDetailsDTO;
import lk.easycarrent.spring.service.ReservationDetailsService;
import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 5:13 PM
 * project back-end-spring
 */

@RestController
@CrossOrigin
@RequestMapping("reservation_details")
public class ReservationDetailsController {

    @Autowired
    private ReservationDetailsService service;

    @GetMapping
    public ResponseUtil getAllReservationDetails(){
        return new ResponseUtil("200","", service.getAllReservationDetails());
    }

    @PostMapping
    public ResponseUtil saveReservationDetails(ReservationDetailsDTO dto){
        service.saveReservationDetails(dto);
        return new ResponseUtil("200","saved",dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteReservationDetails(String id){
        service.deleteReservationDetails(id);
        return new ResponseUtil("200","deleted",id);
    }

    @PutMapping
    public ResponseUtil updateReservationDetails(@RequestBody ReservationDetailsDTO dto){
        service.updateReservationDetails(dto);
        return new ResponseUtil("200","updated",dto);
    }
}
