package com.example.servise_auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.servise_auth.exceptionsAndHandlers.InvalidCredentials;
import com.example.servise_auth.exceptionsAndHandlers.UnauthorizedUser;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(InvalidCredentials.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> handleInvalidCredentials(InvalidCredentials e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(UnauthorizedUser.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public ResponseEntity<String> handleUnauthorizedUser(UnauthorizedUser e) {
		System.out.println("Unauthorized access attempt: "+e.getMessage());
		return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
	}

}
