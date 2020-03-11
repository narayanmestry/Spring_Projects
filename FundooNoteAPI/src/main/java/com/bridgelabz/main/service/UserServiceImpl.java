package com.bridgelabz.main.service;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;
//import java.util.List;
import java.util.List;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bridgelabz.main.config.Jms;
//import com.bridgelabz.main.config.Jms;
import com.bridgelabz.main.config.Jwt;
import com.bridgelabz.main.dto.ForgotPasswordDTO;
import com.bridgelabz.main.dto.LoginDTO;
//import com.bridgelabz.main.dto.ForgotPasswordDTO;
//import com.bridgelabz.main.dto.LoginDTO;
import com.bridgelabz.main.dto.RegistrationDTO;
import com.bridgelabz.main.dto.ResetPasswordDTO;
import com.bridgelabz.main.dto.Userdetails;
//import com.bridgelabz.main.dto.ResetPasswordDTO;
//import com.bridgelabz.main.dto.Userdetails;
import com.bridgelabz.main.model.User;
import com.bridgelabz.main.repository.UserRepository;
import com.bridgelabz.main.response.Response;

@Service
@Transactional
@PropertySource("classpath:application.properties") // add path of message properties
public class UserServiceImpl implements UserService {

	
	@Autowired
	private BCryptPasswordEncoder bryBCryptPasswordEncoder; // cryptographic password encoder (cipher/plain form)
	@Autowired
	private ModelMapper modelMapper; // model-mapper
	
	@Autowired
	private UserRepository userRepository; // user repository
	
	@Autowired
	private Environment environment; // environment for accessing message property

	@Autowired
	private Jwt jwt; // json web token
	
	@Autowired
	private Jms jms;

	@Override
//	@Cacheable("user")
	public Response saveNewuser(RegistrationDTO registrationDto) {
		Response res = new Response();
		User user = modelMapper.map(registrationDto, User.class);
		// find email is exist or not
		User userExist = userRepository.findByEmail(registrationDto.getEmail());
		if (userExist != null) { // if exist
			return new Response(environment.getProperty("SERVIER_CODE_ERROR"), environment.getProperty("USER_PRESENT"));
		} else { // if not exist
			if (registrationDto.getPassword().equals(registrationDto.getConpassword())) {
				String token = jwt.createToken(registrationDto.getEmail());
				res.setToken(token);
			jms.sendMail(registrationDto.getEmail(), token); // send meail
				
//				System.out.pr ntln("@@@@@@My TOken "+token);
//				user.setPassword(bryBCryptPasswordEncoder.encode(user.getPassword())); // encrypted password
				user.setPassword(user.getPassword()); // encrypted password

				Date date = new Date(); // set join & modified date of new user
				Date expdate= addMinutes(date, 60);  //60 min add 
				System.out.println("Exp date" + expdate);
			
				user.setJoined(date);
				user.setModified(expdate);

				userRepository.save(user); // save new user entry.
				System.out.println("@@@"+environment.getProperty("SERVER_CODE_SUCCESS"));
				
				return new Response(environment.getProperty("SERVER_CODE_SUCCESS"),
						environment.getProperty("NEW_USER_CREATED"),res.getToken());
			}
		}

		return new Response(environment.getProperty("SERVIER_CODE_ERROR"),
				environment.getProperty("INVALID_CREDENTIALS")); // if user not show throw error
	}


	 public static Date addMinutes(Date date, int amount) {
	      return add(date, Calendar.MINUTE, amount);
	      
	  }

	 private static Date add(Date date, int calendarField, int amount) {
	      if (date == null) {
	          throw new IllegalArgumentException();
	      }
	      Calendar c = Calendar.getInstance();
	      c.setTime(date);
	      c.add(calendarField, amount);
//	      System.out.println(c.getTime());
	      return c.getTime();
	  }	

	@Override
//	@Cacheable("user")
	public List<Userdetails> getAllUserList() {
		
		List<User> userList = userRepository.findAll();	// get all resord form DB -->List iwhich Contain only User data 
		List<Userdetails> userAlldetailslist = new ArrayList<Userdetails>();	 /// this is List Whicjh Contain Only Userdetails 
		Userdetails[] userDetails = modelMapper.map(userList,Userdetails[].class);
		
		for(Userdetails udetails : userDetails)	
		{
//			System.out.println(udetails.getEmail());
			userAlldetailslist.add(udetails);
		}		
		return userAlldetailslist;
		
	}


	@Override
	public Response login(LoginDTO login, String token) {
	User user = modelMapper.map(login,User.class);
	User userExist = userRepository.findByEmail(user.getEmail());
//	System.out.println(user.getEmail()+"@@@@"+userExist);
	if(userExist==null)
	{
		System.out.println("Please Enter Valid Data");
		
	}
	else
	{
		
		if(user.getPassword().equals(userExist.getPassword()))
		{
		return new Response(environment.getProperty("SERVER_CODE_SUCCESS"),
				environment.getProperty("LOGIN_SUCCESS"));
		}
	}
	
	return new Response(environment.getProperty("SERVER_CODE_ERROR"),
			environment.getProperty("INVALID_CREDENTIALS"));
	}


	@Override
//	@Cacheable("user")
	public Response forgotPassword(ForgotPasswordDTO forgotPassword) {
		User user = modelMapper.map(forgotPassword,User.class);
		User userExist = userRepository.findByEmail(user.getEmail());
		if(userExist==null)
		{
			return new Response(environment.getProperty("SERVER_CODE_ERROR"),environment.getProperty("INVALID_CREDENTIALS"));
		}
		else
		{
			String token = jwt.createToken(user.getEmail());  //generate mail
			jms.sendMail(user.getEmail(), token); 	
			
			return new Response(environment.getProperty("SERVER_CODE_SUCCESS"),environment.getProperty("FORGOT_PASSWORD"));
		}
	}


	@Override
//	@Cacheable("user")
	public Response resetPassword(ResetPasswordDTO resetpassword) {
		User user = modelMapper.map(resetpassword,User.class);
		User userExits = userRepository.findByEmail(user.getEmail());
		
		if(userExits!=null)
		{
				String token = jwt.createToken(user.getEmail());
				jms.sendMail(user.getEmail(),token);
				
				if(resetpassword.getPassword().equals(resetpassword.getConPassword()))
				{
					user.setPassword(resetpassword.getPassword());
					Date date = new Date(); // set join & modified date of new user
					Date expdate= addMinutes(date, 60);  //60 min add 
					System.out.println("Exp date" + expdate);
				
					user.setJoined(date);
					user.setModified(expdate);
					
					return new Response(environment.getProperty("SERVER_CODE_SUCCESS"),environment.getProperty("TOKEN_SUCCESS"),token);
				}	
				
		}
		else
		{
			return new Response(environment.getProperty("SERVER_CODE_SUCCESS"),environment.getProperty("INVALID_CREDENTIALS_RECOVERY"));
		}
		
		return null;
	}
	
	
	
	
}