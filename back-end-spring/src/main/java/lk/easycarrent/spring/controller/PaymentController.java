package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.service.PaymentService;
import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
