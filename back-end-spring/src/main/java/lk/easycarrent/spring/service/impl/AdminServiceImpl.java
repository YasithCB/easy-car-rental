package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.dto.AdminDTO;
import lk.easycarrent.spring.entity.Admin;
import lk.easycarrent.spring.repo.AdminRepo;
import lk.easycarrent.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 10:16 PM
 * project back-end-spring
 */

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private AdminRepo repo;

    @Override
    public void saveAdmin(AdminDTO dto) {
        repo.save(mapper.map(dto, Admin.class));
    }
}
