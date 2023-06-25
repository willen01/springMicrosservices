package com.willen.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willen.hrpayroll.entities.Payment;
import com.willen.hrpayroll.entities.Worker;
import com.willen.hrpayroll.feignClients.WorkerFeign;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeign workerFeignClient;

    public Payment getPayment(Long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}