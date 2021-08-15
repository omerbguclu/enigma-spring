package com.example.enigma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rotor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rotorName;
	private String modelName;
	String rotorOrder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRotorName() {
		return rotorName;
	}

	public void setRotorName(String rotorName) {
		this.rotorName = rotorName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getRotorOrder() {
		return rotorOrder;
	}

	public void setRotorOrder(String rotor) {
		this.rotorOrder = rotor;
	}

}
