package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.PaymentDTO;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 1:25 PM
 * project back-end-spring
 */

@Service
@Transactional
public interface PaymentService {
    ArrayList<PaymentDTO> getAllPayments();

    void savePayment(PaymentDTO dto);

    void deletePayment(String id);
}
