package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.UserDTO;
import lk.easycarrent.spring.repo.UserRepo;
import lk.easycarrent.spring.service.UserService;
import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private UserService service;

    @GetMapping
    public ResponseUtil getAllUsers(){
        return new ResponseUtil("200","",service.getAllUsers());
    }

    @PostMapping
    public ResponseUtil saveUser(UserDTO dto){
        service.saveUser(dto);
        return new ResponseUtil("200","User "+dto.getUserName()+" saved", dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteUser(String id){
        service.deleteUser(id);
        return new ResponseUtil("200","user "+id+" deleted", id);
    }

}
