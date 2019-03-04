package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmailTest  extends SendEmailTest {
    public String baseUrl = "http://14.140.202.211:8000/";
	public static WebDriver driver;
	
	
	//public  static void main(String[] args) {
        @BeforeMethod
        public void setUp() {
        	
		System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
	      		 
	      		 sendEmail();

			}
	      	 else {
	      		//sendEmail();
	      		 System.out.println("Dictum is not working");
	      	 }
	      	 

			
				}
		
		@AfterMethod
		public void tearDown() throws InterruptedException {
			Thread.sleep(2000);;
			//driver.quit();
		}

	}

		
			
	
	
	
	

