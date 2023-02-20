package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.dto.ReservationDTO;
import lk.easycarrent.spring.entity.Reservation;
import lk.easycarrent.spring.repo.ReservationRepo;
import lk.easycarrent.spring.service.ReservationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 3:53 PM
 * project back-end-spring
 */

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public ArrayList<ReservationDTO> getAllReservations() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<ReservationDTO>>(){}.getType());
    }

    @Override
    public void saveReservation(ReservationDTO dto) {
        repo.save(mapper.map(dto, Reservation.class));
    }
}
