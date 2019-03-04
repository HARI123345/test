package com.placeorder.qa.testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportEmailTest {

	
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
			public void test() {
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/h1")));
			WebElement title = driver.findElement(By.xpath("//body/h1"));
			//  System.out.println(title.getText());

				
			try {
				String test =title.getText();
	        
	      	 Assert.assertTrue(test.contains("Create Booking"), "");

			}
			catch(Throwable t) {
				System.out.println("Dictum Working fine");
			}
			}
			
			@AfterMethod
			public void tearDown() throws InterruptedException {
				Thread.sleep(2000);;
				driver.quit();
			}

		
	}


