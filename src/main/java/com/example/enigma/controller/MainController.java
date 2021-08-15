package com.example.enigma.controller;

import java.util.Arrays;
import java.util.List;

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
		List<String> rotorlist = Arrays.asList("EKMFLGDQVZNTOWYHXUSPAIBRCJ".split(""));
		rotorInitializerService.SetRotorOrder(rotor1, rotorlist);
		System.out.println(rotor1.getRotor().toString());
		model.addAttribute("rotor", String.join("", rotor1.getRotor()));
		return "index";
	}
}
