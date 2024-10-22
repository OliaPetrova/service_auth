package com.example.servise_auth.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.servise_auth.service.Authorities;
import com.example.servise_auth.service.AuthorizationService;

@RestController
public class AuthorizationController {
    private final AuthorizationService service;
    
    public AuthorizationController(AuthorizationService service) {
		this.service = service;
	}

	@GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}
