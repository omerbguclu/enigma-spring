package com.example.enigma.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.enigma.model.Reflector;

@Repository
public interface ReflectorRepository extends JpaRepository<Reflector, Long>{
	
	Optional<Reflector> findById(Long id);
	Optional<Reflector> findByRotorName(String rotorName);
	Boolean existsByRotorOrder(String rotorOrder);
}
