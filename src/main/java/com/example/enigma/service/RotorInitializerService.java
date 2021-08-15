package com.example.enigma.service;

import com.example.enigma.model.Rotor;

public interface RotorInitializerService {
	
	void SetRotorOrder(Rotor rotor, String rotorOrder);
	String GetRotorOrder(Rotor rotor);
}
