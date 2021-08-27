package com.example.enigma.service;

import com.example.enigma.model.Rotor;
import com.example.enigma.model.SessionUser;

public interface RotorService {
	
	Rotor findById(Long id);
	Rotor findByRotorName(String rotorName);
	String getRotorOrder(Rotor rotor);
	void save(Rotor rotor);
	Boolean existsByRotorOrder(String rotorOrder);
	void turnRotor(Rotor rotor);
	void turnRotor(SessionUser sessionUser);
}
