package com.bridgelabz.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
public class Jms {
	
	@Autowired
	private JavaMailSender javaMailsender;	

	public void sendMail(String email,String token)
	{
//		System.out.println(email+"--->"+token);
		SimpleMailMessage mail = new SimpleMailMessage();
		
		mail.setFrom("fundoonote122@gmail.com");
		System.out.println(email);
		mail.setTo(email);
		mail.setText(token);
		mail.setSubject("Verify the Token :");
		
		javaMailsender.send(mail);
	}
		
}
