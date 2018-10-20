package com.bridgeit.fundooNote.utilservice;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendingMail {
	
		static String from="aadira392@gmail.com";
		static String password="aadi123456";
		static Properties props=new Properties();
		
		public static String sendMail(String mailTo,String msg,String token)
		{
			props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.socketFactory.port", "465");
	        props.put("mail.smtp.socketFactory.class",
	                "javax.net.ssl.SSLSocketFactory");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.port", "465");
	        props.put("mail.smtp.starttls.enable", "true");

	        //get Session provides the scope of the message 
	        Session session = Session.getInstance(props,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(from, password);
	                    }
	                });
	       
	        try {
	        	
	            MimeMessage message = new MimeMessage(session);
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailTo));
	            message.setSubject(msg,"UTF-8");
	            //message.setContent("text/html");
	            message.setText(token,"UTF-8");
	            
	            
	            //send message  
	            Transport.send(message);
	            System.out.println("message sent successfully");
	          
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    
			return null;
		}
		
	}


