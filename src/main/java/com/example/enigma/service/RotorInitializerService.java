package com.example.enigma.service;

import java.util.List;

import com.example.enigma.model.Rotor;

public interface RotorInitializerService {
	
	void SetRotorOrder(Rotor rotor, List<String> rotorlist);
	List<String> GetRotorOrder(Rotor rotor);
}
