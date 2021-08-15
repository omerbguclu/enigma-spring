package com.example.enigma.config;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enigma.model.Rotor;
import com.example.enigma.service.RotorService;

// https://www.geeksforgeeks.org/singleton-class-java/
@Service
public class SingletonSettingsImpl implements SingletonSettings{

    private static boolean single_instance = false;
    
    public static boolean isDbFilledAlready = false;
    
    @Autowired
    private RotorService rotorService;

    @Override
    public void checkDatabase()
    {
        if (single_instance == false)
        {
        	single_instance = true;
        	Rotor r = new Rotor();
        	r.setRotorName("asdas");
        	String magicRotor = rotorService.getRotorOrder(r);
        	
        	if(Objects.isNull(magicRotor) == false)
        	{
        		isDbFilledAlready = true;
        		System.out.println("dolu");
        	}
        	System.out.println("bos");
        }
    }

}
