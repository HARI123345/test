package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
      public static WebDriver driver;
	public static void main(String[] args) {
		//driver directory path
     System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
     driver = new ChromeDriver();
     //launch browser
     driver.get("http://www.echoecho.com/htmlforms10.htm");
     //maximize window
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     
       List<WebElement> list = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
       System.out.println(list.size());
       
       for (WebElement e : list) {
    	   System.out.println(e.getAttribute("value"));
    	   //String gro = ele.getAttribute("value");
    	  // System.out.println(e.isSelected());
    	   
    	   if(e.getAttribute("value").equals("Water")) {
    		   
    		  e.click();
    		  System.out.println(e.isSelected());
    		   
    		  System.out.println("select water");   
    		   }
    		   
    	   System.out.println("---------------------------");
    	   if(e.getAttribute("value").equals("Beer")) {
    		   e.click();
    		   System.out.println(e.isSelected());
    		   System.out.println("Select Beer");
    	   }
    		   
    	   }
       }
     
	}

