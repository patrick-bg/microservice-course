package com.dev.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.dev.hrpayroll.entities.Payment;

@Service
public class PaymenteService {

	public Payment getPayment (long workerId, int days) {
		return new Payment ("Bob", 200.0, days);
	}
}
