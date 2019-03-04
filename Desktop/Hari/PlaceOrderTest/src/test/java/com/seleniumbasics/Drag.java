package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {


	public static WebDriver driver;
	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        System.out.println(drag.getText());
        Actions action = new Actions(driver);
        action.moveToElement(drag).dragAndDropBy(drag, 250, 250).build().perform();
        System.out.println("Darg");

	}

}
