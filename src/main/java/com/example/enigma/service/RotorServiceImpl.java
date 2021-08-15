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
}
