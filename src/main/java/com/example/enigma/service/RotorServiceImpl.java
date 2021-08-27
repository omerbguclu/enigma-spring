package com.example.enigma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enigma.model.Rotor;
import com.example.enigma.repository.RotorRepository;

@Service
public class RotorServiceImpl implements RotorService{
	
	@Autowired
	private RotorRepository rotorRepository;
	
	@Override
	public Rotor findById(Long id) {
		java.util.Optional<Rotor> opt = rotorRepository.findById(id);
		return opt.isPresent() ? rotorRepository.findById(id).get() : null;
	}
	
	@Override
	public Rotor findByRotorName(String rotorName) {
		java.util.Optional<Rotor> opt = rotorRepository.findByRotorName(rotorName);
		return opt.isPresent() ? rotorRepository.findByRotorName(rotorName).get() : null;
	}

	@Override
	public String getRotorOrder(Rotor rotor) {
		return rotor.getRotorOrder();
	}

	@Override
	public void save(Rotor rotor) {
		rotorRepository.save(rotor);
	}

	@Override
	public Boolean existsByRotorOrder(String rotorOrder) {
		return rotorRepository.existsByRotorOrder(rotorOrder);
	}
	
	@Override
	public void turnRotor(Rotor rotor) {
		String rotorOrder = rotor.getRotorOrder();
		StringBuilder stringBuilder = new StringBuilder(rotorOrder);
		stringBuilder.append(rotorOrder.charAt(0));
		stringBuilder.deleteCharAt(0);
		rotor.setRotorOrder(stringBuilder.toString());
	}
}
