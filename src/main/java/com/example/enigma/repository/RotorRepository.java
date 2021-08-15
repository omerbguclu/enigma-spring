package com.example.enigma.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.enigma.model.Rotor;

@Repository
public interface RotorRepository extends JpaRepository<Rotor, Long>{
	
	Optional<Rotor> findById(Long id);
	Boolean existsByRotorOrder(String rotorOrder);
}
