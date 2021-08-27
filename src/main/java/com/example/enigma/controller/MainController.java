package com.example.enigma.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.enigma.model.Rotor;
import com.example.enigma.model.SessionUser;
import com.example.enigma.service.RotorService;
import com.example.enigma.service.SessionUserService;

@Controller
public class MainController {
	
	@Autowired
	private RotorService rotorService;
	
	@Autowired
	private SessionUserService sessionUserService;
	
	@GetMapping("/index")
	public String index(Model model, HttpServletRequest request) {
		
		String sessionId = request.getSession().getId();
		SessionUser sessionUser = sessionUserService.findBySessionId(sessionId);
		
		if(sessionUser == null)
		{
			Rotor rotor1 = rotorService.findByRotorName("I");
			
			sessionUser = new SessionUser();
			sessionUser.setSessionId(sessionId);
			sessionUser.setRotorOrder(rotor1.getRotorOrder());
		}
		
		rotorService.turnRotor(sessionUser);
		sessionUserService.save(sessionUser);

		model.addAttribute("rotor", sessionUser.getRotorOrder());
		return "index";
	}
}
