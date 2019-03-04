package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {

	 public static WebDriver driver;
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[@id='signin_info']/a[text()='Sign in']")).click();
	driver.findElement(By.xpath("//div[@class='create-new-account f15 alignC bold']/a[text()='Create a new account']")).click();
	WebElement dropdown = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
	//System.out.println(day.size());
	
	//Day
	List<WebElement> option = dropdown.findElements(By.tagName("option"));
	//System.out.println(option.size());
	
	for(int i=0; i < option.size(); i++) {
		
		 String ele = option.get(i).getAttribute("value");
		 //System.out.println(ele);
		 if(option.get(i).getAttribute("value").equals("22")) {
			 option.get(i).click();
			 System.out.println(option.get(i).isSelected());
			 
		 }
		 
		
		
	}
	
	
	//month
	WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	   List<WebElement> month = dropdown1.findElements(By.tagName("option"));
	  // System.out.println(month.size());
	   for(int j = 0; j < month.size(); j++) {
		   String month1  =  month.get(j).getAttribute("innerHTML");
		//  System.out.println(month1);
		   if(month.get(j).getAttribute("innerHTML").equals("OCT")){
			   
			   month.get(j).click();
			   System.out.println(month.get(j).isSelected());
		   }
	   }

	   
	   //year
	   WebElement dropdown2 = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
	   List<WebElement> year = dropdown2.findElements(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]/option"));
	   //System.out.println(year.size());
	   for(int k =0; k < year.size(); k++) {
		   String yea = year.get(k).getAttribute("value");
		 //  System.out.println(yea);
		   if(year.get(k).getAttribute("value").equals("2019")) {
			   
			   year.get(k).click();
			   System.out.println(year.get(k).isSelected());
		   }
		   
	   }
	   
	   
	}

}
