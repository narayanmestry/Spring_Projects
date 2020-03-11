package com.bridgelabz.main.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.bridgelabz.main.dto.ForgotPasswordDTO;
import com.bridgelabz.main.dto.LoginDTO;

//import java.util.List;

//import com.bridgelabz.main.dto.ForgotPasswordDTO;
//import com.bridgelabz.main.dto.LoginDTO;
import com.bridgelabz.main.dto.RegistrationDTO;
import com.bridgelabz.main.dto.ResetPasswordDTO;
//import com.bridgelabz.main.dto.ResetPasswordDTO;
//import com.bridgelabz.main.dto.Userdetails;
import com.bridgelabz.main.response.Response;

public interface UserService {

	
	Response saveNewuser(RegistrationDTO registrationDto);

	List getAllUserList();

	Response login(LoginDTO login, String token);

	Response forgotPassword(ForgotPasswordDTO forgotPassword);

	Response resetPassword(ResetPasswordDTO resetpassword);

	
	
	


}
