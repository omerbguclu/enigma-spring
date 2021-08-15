package com.example.enigma.service;

import com.example.enigma.model.Rotor;

public interface RotorService {
	
	Rotor findById(Long id);
	String getRotorOrder(Rotor rotor);
	void save(Rotor rotor);
	Boolean existsByRotorOrder(String rotorOrder);
}
