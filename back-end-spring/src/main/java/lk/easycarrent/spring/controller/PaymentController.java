package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.PaymentDTO;
import lk.easycarrent.spring.service.PaymentService;
import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 1:22 PM
 * project back-end-spring
 */

@RestController
@CrossOrigin
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @GetMapping
    public ResponseUtil getAllPayments(){
        return new ResponseUtil("200","", service.getAllPayments());
    }

    @PostMapping
    public ResponseUtil savePayment(@ModelAttribute PaymentDTO dto){
        service.savePayment(dto);
        return new ResponseUtil("200","Payment details saved",dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deletePayment(String id){
        service.deletePayment(id);
        return new ResponseUtil("200","payment "+id+" deleted",id);
    }

    @PutMapping
    public ResponseUtil updatePayment(@RequestBody PaymentDTO dto){
        service.updatePayment(dto);
        return new ResponseUtil("200", "payment "+ dto.getId()+"'s details updated",dto);
    }
}
