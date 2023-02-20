package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.ReservationDTO;

import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 3:53 PM
 * project back-end-spring
 */


public interface ReservationService {
    ArrayList<ReservationDTO> getAllReservations();

    void saveReservation(ReservationDTO dto);

    void deleteReservation(String id);
}
