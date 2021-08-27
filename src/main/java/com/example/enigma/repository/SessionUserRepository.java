package com.example.enigma.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.enigma.model.SessionUser;

@Repository
public interface SessionUserRepository extends JpaRepository<SessionUser, Long>{
	
	Optional<SessionUser> findById(Long id);
	Optional<SessionUser> findBySessionId(String sessionId);
}
