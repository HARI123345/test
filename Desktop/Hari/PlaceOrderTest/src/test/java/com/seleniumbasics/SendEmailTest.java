package com.seleniumbasics;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailTest {
	
	   public static void main(String[] args) throws EmailException {

   
	
	

		System.out.println("Test Started");
			sendEmail();
			System.out.println("Email is sent");
	}

	public static void sendEmail() throws EmailException {
		Email email = new SimpleEmail();
		
		email.setHostName("smtp.gmail.com");
		
		email.setSmtpPort(456);
		
		email.setAuthenticator(new DefaultAuthenticator("v.harikrishna1215@gmail.com", "hari@1234"));
		email.setSSLOnConnect(true);
	//	email.setSSL
		
		email.setFrom("v.harikrishna1215@gmail.com");
		email.setSubject("Selenium test report");
		email.setMsg("Dictum is not working");
		email.addTo("hari@esoftech.org");
		email.send();
	}
	   
}

