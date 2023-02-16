package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 9:45 PM
 * project back-end-spring
 */

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public ResponseUtil getAllAdmins(){
        return new ResponseUtil();
    }

    @PostMapping
    public ResponseUtil saveAdmin(){
        return new ResponseUtil();
    }
}
