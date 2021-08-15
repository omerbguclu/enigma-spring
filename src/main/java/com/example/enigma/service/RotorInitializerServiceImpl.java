package com.example.enigma.service;

import org.springframework.stereotype.Service;

import com.example.enigma.model.Rotor;

@Service
public class RotorInitializerServiceImpl implements RotorInitializerService{

	@Override
	public void SetRotorOrder(Rotor rotor, String rotorOrder) {
		rotor.setRotorOrder(rotorOrder);
	}

	@Override
	public String GetRotorOrder(Rotor rotor) {
		return rotor.getRotorOrder();
	}

}
