package com.example.enigma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enigma.model.Reflector;
import com.example.enigma.repository.ReflectorRepository;

@Service
public class ReflectorServiceImpl implements ReflectorService{
	
	@Autowired
	private ReflectorRepository reflectorRepository;
	
	@Override
	public Reflector findById(Long id) {
		java.util.Optional<Reflector> opt = reflectorRepository.findById(id);
		return opt.isPresent() ? reflectorRepository.findById(id).get() : null;
	}
	
	@Override
	public Reflector findByRotorName(String rotorName) {
		java.util.Optional<Reflector> opt = reflectorRepository.findByRotorName(rotorName);
		return opt.isPresent() ? reflectorRepository.findByRotorName(rotorName).get() : null;
	}

	@Override
	public String getRotorOrder(Reflector reflector) {
		return reflector.getRotorOrder();
	}

	@Override
	public void save(Reflector reflector) {
		reflectorRepository.save(reflector);
	}

	@Override
	public Boolean existsByRotorOrder(String rotorOrder) {
		return reflectorRepository.existsByRotorOrder(rotorOrder);
	}
}
