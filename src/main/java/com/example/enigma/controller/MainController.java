package com.example.enigma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.enigma.model.Rotor;
import com.example.enigma.service.RotorService;

@Controller
public class MainController {
	
	@Autowired
	private RotorService rotorService;
	
	@GetMapping("/index")
	public String index(Model model) {
		Rotor rotor1 = rotorService.findByRotorName("I");
		rotor1.setTurnedRotorOrder(rotor1.getRotorOrder());
		System.out.println(rotor1.getTurnedRotorOrder());
		rotorService.turnRotor(rotor1);
		System.out.println(rotor1.getTurnedRotorOrder());
		model.addAttribute("rotor", rotor1.getTurnedRotorOrder());
		return "index";
	}
}
