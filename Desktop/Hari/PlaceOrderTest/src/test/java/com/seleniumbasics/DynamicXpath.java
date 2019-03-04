package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	
	public static WebDriver driver;
	
	public static void main (String[] args ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
		
		driver = new ChromeDriver();
		//lunch browser
		driver.get("https://in.yahoo.com/?p=us");
		//maximize window 
		driver.manage().window().maximize();
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("Selenium");
		//static wait
		Thread.sleep(2000);
		//get for all data
		//List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"yui_3_18_0_3_1551082940110_770\"]"));
		//Thread.sleep(5000);
//		System.out.println(list.size());
//		list.get(0);
		
		
	     driver.findElement(By.xpath("//*[@id=\"yui_3_18_0_3_1551083322464_808\"]")).click();
	}

}
