package com.example.enigma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.enigma.model.Rotor;

@Service
public class RotorInitializerServiceImpl implements RotorInitializerService{

	@Override
	public void SetRotorOrder(Rotor rotor, List<String> rotorlist) {
		rotor.setRotor(rotorlist);
	}

	@Override
	public List<String> GetRotorOrder(Rotor rotor) {
		return rotor.getRotor();
	}

}
