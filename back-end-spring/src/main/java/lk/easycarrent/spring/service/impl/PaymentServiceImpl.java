package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.dto.PaymentDTO;
import lk.easycarrent.spring.entity.Payment;
import lk.easycarrent.spring.repo.PaymentRepo;
import lk.easycarrent.spring.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 2/20/2023 - 1:26 PM
 * project back-end-spring
 */

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public ArrayList<PaymentDTO> getAllPayments() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<PaymentDTO>>(){}.getType());
    }

    @Override
    public void savePayment(PaymentDTO dto) {
        repo.save(mapper.map(dto, Payment.class));
    }

    @Override
    public void deletePayment(String id) {
        repo.deleteById(Long.valueOf(id));
    }

    @Override
    public void updatePayment(PaymentDTO dto) {
        repo.save(mapper.map(dto, Payment.class));
    }
}
