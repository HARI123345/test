package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Email extends SendEmailTest {

	public static WebDriver driver;
	public static void main(String[] args) throws EmailException  {

		System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
					
		
		driver.get("http://streethopper1123.esoftech.in/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement drag = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
//		WebElement drop = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
//			Actions action = new Actions(driver);
//		
//		action.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
		try {

			
			WebElement li =driver.findElement(By.xpath("//nav[@id='nav']/ol/li/a[text()='Earrings']"));
			li.click();
		//	System.out.println(li.getText());
			sendEmail();
		     System.out.println("Click on category");
		
		}
		catch(Exception e) {
			System.out.println("This website is not working");
		}
	
	}

}
