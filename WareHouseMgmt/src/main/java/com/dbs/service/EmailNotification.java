package com.dbs.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailNotification {
	private final Logger log = LoggerFactory.getLogger(EmailNotification.class);
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	
	/**Method : sendMail
	 * @author Vaibhav
	 *	sendMail
	 */
	public void sendMail() {
		try {
		SimpleMailMessage smp = new SimpleMailMessage();
		smp.setFrom("vaibhavdadas92@gmail.com");
		smp.setTo("vaibhavx10@gmail.com");
		smp.setCc("wadekar.pankesh@gmail.com","chiragpimple7@gmail.com");
		smp.setText("Hey this justa test !!");
		smp.setSubject("Test Message !!");
		
		log.info("smp Details "+smp.getFrom());
		
		javaMailSender.send(smp);
		log.info("Mail Send Successfully ~!!");
		}catch (Exception e) {
			e.printStackTrace();
		}


	}
}
