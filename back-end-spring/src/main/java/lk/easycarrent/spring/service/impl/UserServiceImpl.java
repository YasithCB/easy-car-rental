package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.dto.UserDTO;
import lk.easycarrent.spring.entity.User;
import lk.easycarrent.spring.repo.UserRepo;
import lk.easycarrent.spring.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 8:47 PM
 * project back-end-spring
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveUser(UserDTO dto) {
        userRepo.save(modelMapper.map(dto,User.class));
    }
}
