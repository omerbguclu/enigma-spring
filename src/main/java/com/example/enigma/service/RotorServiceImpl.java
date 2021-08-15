package com.example.enigma.service;

import java.util.Objects;

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
		Object obj = rotorRepository.findById(id);
		return Objects.isNull(obj) ? null : rotorRepository.findById(id).get();
	}

	@Override
	public String getRotorOrder(Rotor rotor) {
		return rotor.getRotorOrder();
	}

}
