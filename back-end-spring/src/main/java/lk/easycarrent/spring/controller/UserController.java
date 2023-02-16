package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 5:34 PM
 * project back-end-spring
 */

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public void getAllUsers(){
        getAllUsers();
    }
}
