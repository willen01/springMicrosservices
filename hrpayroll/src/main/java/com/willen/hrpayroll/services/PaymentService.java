package com.willen.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.willen.hrpayroll.entities.Payment;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        
        // mocked payment
        return new Payment("Bob", 200.00, days);
    }
}
