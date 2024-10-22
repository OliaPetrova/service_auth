package com.example.servise_auth.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.servise_auth.service.Authorities;

@Repository
public class UserRepository {
	private final Map<String, String> users = new HashMap<>();
	private final Map<String, List<Authorities>> authoritiesMap = new HashMap<>() ;
	
	public UserRepository() {
		users.put("user1", "user123");
		users.put("user2", "user123");
		
		authoritiesMap.put("user1", List.of(Authorities.READ, Authorities.WRITE));
		authoritiesMap.put("user2", List.of(Authorities.READ));
		
	}
	
	
	public List<Authorities> getUserAuthorities(String user, String password) {
		if (users.containsKey(user) && users.get(user).equals(password)) {
			return authoritiesMap.getOrDefault(user, List.of());
		}
		return List.of();
	}
}
