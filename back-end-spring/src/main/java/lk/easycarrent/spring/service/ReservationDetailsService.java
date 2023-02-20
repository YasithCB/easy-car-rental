package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.ReservationDetailsDTO;

import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 5:18 PM
 * project back-end-spring
 */

public interface ReservationDetailsService {
    ArrayList<ReservationDetailsDTO> getAllReservationDetails();
}
