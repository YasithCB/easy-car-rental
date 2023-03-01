package lk.easycarrent.spring.controller;

import lk.easycarrent.spring.dto.UserDTO;
import lk.easycarrent.spring.repo.UserRepo;
import lk.easycarrent.spring.service.UserService;
import lk.easycarrent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "register", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseUtil registerUser(@RequestPart("files") MultipartFile[] file, @RequestPart("user") UserDTO userDTO) {

        for (MultipartFile myFile : file) {
            try {
                String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
                File uploadsDir = new File(projectPath + "/uploads");
                uploadsDir.mkdir();
                myFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + myFile.getOriginalFilename()));
                System.out.println(projectPath);
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
                return new ResponseUtil("500", "Registration Failed.Try Again Latter", null);
            }
        }

        userDTO.setDrivingLicenseImageFront("uploads/" + userDTO.getDrivingLicenseImageFront());
        userDTO.setDrivingLicenseImageBack("uploads/" + userDTO.getDrivingLicenseImageBack());

        userDTO.setNicImageFront("uploads/" + userDTO.getNicImageFront());
        userDTO.setNicImageBack("uploads/" + userDTO.getNicImageBack());

        service.saveUser(userDTO);
        return new ResponseUtil("200","User Saved",userDTO);
    }

    @PostMapping
    public ResponseUtil saveUser(@RequestBody UserDTO dto){
        service.saveUser(dto);
        return new ResponseUtil("200","User Saved",dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteUser(String id){
        service.deleteUser(id);
        return new ResponseUtil("200","user "+id+" deleted", id);
    }

    @PutMapping
    public ResponseUtil updateUser(@RequestBody UserDTO dto){
        service.updateUser(dto);
        return new ResponseUtil("200", "user "+dto.getUserName()+"'s details updated", dto);
    }
}
