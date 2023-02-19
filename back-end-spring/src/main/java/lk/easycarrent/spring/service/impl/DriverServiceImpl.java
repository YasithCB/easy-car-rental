package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.dto.DriverDTO;
import lk.easycarrent.spring.entity.Driver;
import lk.easycarrent.spring.repo.DriverRepo;
import lk.easycarrent.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 11:14 PM
 * project back-end-spring
 */

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private DriverRepo repo;

    @Override
    public void saveDriver(DriverDTO dto) {
        repo.save(mapper.map(dto, Driver.class));
    }

    @Override
    public ArrayList<DriverDTO> getAllDrivers() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<DriverDTO>>(){}.getType());
    }
}
