package com.example.enigma.service;

import com.example.enigma.model.SessionUser;

public interface ISessionUserService {
	
	void save(SessionUser session);
	SessionUser findBySessionId(String sessionId);
}
