package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailNotification {

	@Autowired
	private JavaMailSender javaMailSender;
	
	
	
	public void sendMail() {
		try {
		SimpleMailMessage smp = new SimpleMailMessage();
		smp.setFrom("vaibhavdadas92@gmail.com");
		smp.setTo("vaibhavx10@gmail.com");
		smp.setCc("wadekar.pankesh@gmail.com","chiragpimple7@gmail.com");
		smp.setText("Hey this justa test !!");
		smp.setSubject("Test Message !!");
		
		System.out.println("smp Details "+smp.getFrom());
		
		javaMailSender.send(smp);
		System.out.println("Mail Send Successfully ~!!");
		}catch (Exception e) {
			e.printStackTrace();
		}


	}
}
