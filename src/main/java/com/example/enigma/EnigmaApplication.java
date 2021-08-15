package com.example.enigma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.enigma.config.StartupControls;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class EnigmaApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(EnigmaApplication.class, args);
		context.getBean(StartupControls.class).checkDatabase();
	}

}
