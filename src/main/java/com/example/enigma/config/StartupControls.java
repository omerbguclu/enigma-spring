package com.example.enigma.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.enigma.model.Rotor;
import com.example.enigma.service.RotorService;

@Component
public class StartupControls {

	@Autowired
	private RotorService rotorService;

	String magicRotorOrder = "DATABASEFILLEDALREADY";

	// https://en.wikipedia.org/wiki/Enigma_rotor_details

	public void checkDatabase() {
		if (!rotorService.existsByRotorOrder(magicRotorOrder)) {
			Rotor magicRotor = new Rotor();
			magicRotor.setRotorName("DATABASECHECKSYSTEM");
			magicRotor.setRotorOrder(magicRotorOrder);
			magicRotor.setModelName("Enigma db is created");

			Rotor rotorI = new Rotor();
			rotorI.setRotorName("I");
			rotorI.setRotorOrder("EKMFLGDQVZNTOWYHXUSPAIBRCJ");
			rotorI.setModelName("Enigma I");

			Rotor rotorII = new Rotor();
			rotorII.setRotorName("II");
			rotorII.setRotorOrder("AJDKSIRUXBLHWTMCQGZNPYFVOE");
			rotorII.setModelName("Enigma I");

			Rotor rotorIII = new Rotor();
			rotorIII.setRotorName("III");
			rotorIII.setRotorOrder("BDFHJLCPRTXVZNYEIWGAKMUSQO");
			rotorIII.setModelName("Enigma I");

			Rotor rotorIV = new Rotor();
			rotorIV.setRotorName("IV");
			rotorIV.setRotorOrder("ESOVPZJAYQUIRHXLNFTGKDCMWB");
			rotorIV.setModelName("M3 Army");

			Rotor rotorV = new Rotor();
			rotorV.setRotorName("V");
			rotorV.setRotorOrder("VZBRGITYUPSDNHLXAWMJQOFECK");
			rotorV.setModelName("M3 Army");

			Rotor rotorVI = new Rotor();
			rotorVI.setRotorName("VI");
			rotorVI.setRotorOrder("JPGVOUMFYQBENHZRDKASXLICTW");
			rotorVI.setModelName("M3 & M4 Naval (FEB 1942)");

			Rotor rotorVII = new Rotor();
			rotorVII.setRotorName("VII");
			rotorVII.setRotorOrder("NZJHGRCXMYSWBOUFAIVLPEKQDT");
			rotorVII.setModelName("M3 & M4 Naval (FEB 1942)");

			Rotor rotorVIII = new Rotor();
			rotorVIII.setRotorName("VIII");
			rotorVIII.setRotorOrder("FKQHTLXOCBJSPDZRAMEWNIUYGV");
			rotorVIII.setModelName("M3 & M4 Naval (FEB 1942)");

    		rotorService.save(magicRotor);
    		rotorService.save(rotorI);
    		rotorService.save(rotorII);
    		rotorService.save(rotorIII);
    		rotorService.save(rotorIV);
    		rotorService.save(rotorV);
    		rotorService.save(rotorVI);
    		rotorService.save(rotorVII);
    		rotorService.save(rotorVIII);

			System.out.println("Rotors are filled ");
		}
	}

}
