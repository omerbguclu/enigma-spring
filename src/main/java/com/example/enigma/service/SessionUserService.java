package com.example.enigma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enigma.model.SessionUser;
import com.example.enigma.repository.SessionUserRepository;

@Service
public class SessionUserService implements ISessionUserService {

	@Autowired
	private SessionUserRepository sessionUserRepository;

	@Override
	public void save(SessionUser sessionUser) {
		sessionUserRepository.save(sessionUser);
	}

	@Override
	public SessionUser findBySessionId(String sessionId) {
		java.util.Optional<SessionUser> opt = sessionUserRepository.findBySessionId(sessionId);
		return opt.isPresent() ? sessionUserRepository.findBySessionId(sessionId).get() : null;
	}

}
