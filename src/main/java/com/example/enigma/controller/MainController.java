package com.example.enigma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.enigma.model.Rotor;
import com.example.enigma.service.RotorInitializerService;

@Controller
public class MainController {

	@Autowired
	private RotorInitializerService rotorInitializerService;
	
	@GetMapping("/index")
	public String index(Model model) {
		Rotor rotor1 = new Rotor();
		rotorInitializerService.SetRotorOrder(rotor1, "EKMFLGDQVZNTOWYHXUSPAIBRCJ");
		System.out.println(rotor1.getRotorOrder());
		model.addAttribute("rotor", String.join("", rotor1.getRotorOrder()));
		return "index";
	}
}
