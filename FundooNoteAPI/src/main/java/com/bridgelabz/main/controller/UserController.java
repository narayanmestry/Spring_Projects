package com.bridgelabz.main.controller;

import java.util.List;

import javax.persistence.Cacheable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.main.dto.ForgotPasswordDTO;
import com.bridgelabz.main.dto.LoginDTO;
import com.bridgelabz.main.dto.RegistrationDTO;
import com.bridgelabz.main.dto.ResetPasswordDTO;
import com.bridgelabz.main.repository.UserRepository;
import com.bridgelabz.main.response.Response;
import com.bridgelabz.main.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userservice;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "WelCome to Spring";
		
	}
	
	// Registration of New User 
	@PostMapping("/addUser") // register new users
	public ResponseEntity<Response> addUser(@RequestBody RegistrationDTO registrationDto) {
		return new ResponseEntity<Response>(userservice.saveNewuser(registrationDto), HttpStatus.OK);
	}
	
	@GetMapping("/show")
	public ResponseEntity<List> getuserList()
	{
		return new ResponseEntity<List>(userservice.getAllUserList(),HttpStatus.OK);
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<Response> login(@RequestBody LoginDTO login, @RequestParam(value = "token") String token)
	{
		return new ResponseEntity<Response>(userservice.login(login,token),HttpStatus.OK);
		
	}
	
	@PostMapping("/forgotpassword")
	public ResponseEntity<Response>  forgotPassword(@RequestBody ForgotPasswordDTO forgotPassword)
	{
		return new ResponseEntity<Response>(userservice.forgotPassword(forgotPassword),HttpStatus.OK);
		
	}
	
	
	@PostMapping("/reset")
	public ResponseEntity<Response> resetpassword(@RequestBody ResetPasswordDTO resetpassword)
	{
		return new ResponseEntity<Response>(userservice.resetPassword(resetpassword),HttpStatus.OK);
	}

	
	


}
