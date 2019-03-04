package com.schedule.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScheduleTest  {
	
	 
//extends EmailTest{
	 public String baseUrl = "http://14.140.202.211:8000/";
		public static WebDriver driver;
		
		public static void main(String[] args) {
			System.out.println("This is Jar File");
		}
		
	        @BeforeMethod
	        public void setUp() {
	        	
			System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
			driver = new ChromeDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        }
	        
	        
	       public void emailTest() throws EmailException {
	        	
	        	System.out.println("-----------test started--------------------");
	        
                 SendEmail();
				System.out.println("---------------Sent Email------------------------");
	        	
	        }


			public void SendEmail() throws EmailException {
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
			
			@Test
			public void test() throws EmailException {
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/h1")));
				WebElement title = driver.findElement(By.xpath("//body/h1"));
				//  System.out.println(title.getText());

					
					String test =title.getText();
		        
		      	 if(title.getText().equals("Whitelabel Error Page")) {
		      	 
		      		 System.out.println("Dictum is working");
		      		 
		      		

				}
		      	 else {
		      		 
		      		SendEmail();
		      		System.out.println("Dictum is not working");
		      	 }
		      	 

				
					}
			
			@AfterMethod
			public void tearDown() throws InterruptedException {
				Thread.sleep(2000);;
				//driver.quit();
			}


}
