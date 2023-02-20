package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.dto.ReservationDetailsDTO;
import lk.easycarrent.spring.entity.ReservationDetails;
import lk.easycarrent.spring.repo.ReservationDetailsRepo;
import lk.easycarrent.spring.service.ReservationDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 5:19 PM
 * project back-end-spring
 */

@Service
@Transactional
public class ReservationDetailsServiceImpl implements ReservationDetailsService {

    @Autowired
    private ReservationDetailsRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public ArrayList<ReservationDetailsDTO> getAllReservationDetails() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<ReservationDetailsDTO>>(){}.getType());
    }

    @Override
    public void saveReservationDetails(ReservationDetailsDTO dto) {
        repo.save(mapper.map(dto, ReservationDetails.class));
    }

    @Override
    public void deleteReservationDetails(String id) {
        repo.deleteById(Long.valueOf(id));
    }

    @Override
    public void updateReservationDetails(ReservationDetailsDTO dto) {
        repo.save(mapper.map(dto, ReservationDetails.class));
    }

}
