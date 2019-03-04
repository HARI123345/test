package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSlider {
   public static WebDriver driver;
   
 	public static void main(String[] args) {
        
 		System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
 		
 		driver = new ChromeDriver();
 		driver.get("https://jqueryui.com/slider/");
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		
 		
 		List<WebElement> frame = driver.findElements(By.xpath("//*[@id='content']/iframe"));
 		System.out.println(frame.size());
 		
 		driver.switchTo().frame(0);
 		WebElement slider= driver.findElement(By.xpath("//*[@id='slider']/span"));
 	//	System.out.println(slider.getText());
 		Actions action = new Actions(driver);
 		action.moveToElement(slider).dragAndDropBy(slider, 200, 0).build().perform();
 	}
}
