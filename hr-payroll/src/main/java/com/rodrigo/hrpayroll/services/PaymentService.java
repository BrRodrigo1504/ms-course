package com.rodrigo.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rodrigo.hrpayroll.entities.Payment;
import com.rodrigo.hrpayroll.entities.Worker;
import com.rodrigo.hrpayroll.feignclients.WorkerFeignClients;

@Service
public class PaymentService {

	@Value("${hr-worker.host}")
	private String workerHost;

	@Autowired
	private WorkerFeignClients workerFeignClient;

	public Payment getPayment(Long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDAILY_INCOME(), days);

	}
}
