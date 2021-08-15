package com.example.enigma.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.enigma.model.Reflector;
import com.example.enigma.model.Rotor;
import com.example.enigma.service.ReflectorService;
import com.example.enigma.service.RotorService;

@Component
public class StartupControls {

	@Autowired
	private RotorService rotorService;
	
	@Autowired
	private ReflectorService reflectorService;

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
    		
    		Reflector reflectorA = new Reflector();
    		reflectorA.setRotorName("Reflector A");
    		reflectorA.setRotorOrder("EJMZALYXVBWFCRQUONTSPIKHGD");

    		Reflector reflectorB = new Reflector();
    		reflectorB.setRotorName("Reflector B");
    		reflectorB.setRotorOrder("YRUHQSLDPXNGOKMIEBFZCWVJAT");

    		Reflector reflectorC = new Reflector();
    		reflectorC.setRotorName("Reflector C");
    		reflectorC.setRotorOrder("FVPJIAOYEDRZXWGCTKUQSBNMHL");

    		Reflector reflectorBThin = new Reflector();
    		reflectorBThin.setRotorName("Reflector B Thin");
    		reflectorBThin.setRotorOrder("ENKQAUYWJICOPBLMDXZVFTHRGS");
    		reflectorBThin.setModelName("M4 R1 (M3 + Thin)");

    		Reflector reflectorCThin = new Reflector();
    		reflectorCThin.setRotorName("Reflector C Thin");
    		reflectorCThin.setRotorOrder("RDOBJNTKVEHMLFCWZAXGYIPSUQ");
    		reflectorCThin.setModelName("M4 R1 (M3 + Thin)");
    		
    		reflectorService.save(reflectorA);
    		reflectorService.save(reflectorB);
    		reflectorService.save(reflectorC);
    		reflectorService.save(reflectorBThin);
    		reflectorService.save(reflectorCThin);

			System.out.println("Rotors are filled ");
		}
	}

}
