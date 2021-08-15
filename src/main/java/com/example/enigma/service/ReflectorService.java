package com.example.enigma.service;

import com.example.enigma.model.Reflector;

public interface ReflectorService {
	
	Reflector findById(Long id);
	Reflector findByRotorName(String rotorName);
	String getRotorOrder(Reflector reflector);
	void save(Reflector reflector);
	Boolean existsByRotorOrder(String rotorOrder);
}
