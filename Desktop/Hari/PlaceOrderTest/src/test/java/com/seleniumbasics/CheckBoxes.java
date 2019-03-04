package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxes {

   private static final Function<? super WebDriver, Object> ExceptedConditions = null;
public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php"); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     List<WebElement> checkboes = driver.findElements(By.xpath("//div[@class='display']/input[@name='sports']"));
     
     for(WebElement ele :checkboes) {
    	 
    	 String check = ele.getAttribute("value");
    	// System.out.println(check);
    	 if(ele.getAttribute("value").equals("basketball")) {
    		 ele.click();
    		 //System.out.println(ele.isSelected());
    	 }
     }
     
     
     System.out.println("-----------------------------");
    	 
   for(WebElement ele :checkboes) {
    	 
    	// String check = ele.getAttribute("value");
    	// System.out.println(check);
    		//System.out.println(ele.isSelected());
     //
            
	}
	}
}