package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='overlays-pieces-CloseX__close--3jowQ overlays-pieces-CloseX__inverted--3ADoB']")).click();
		System.out.println("Close popup");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Flights']")));
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='4']")));
		driver.findElement(By.xpath("//input[@tabindex='4']")).clear();
		WebElement text = driver.findElement(By.xpath("//input[@tabindex='4']"));
				text.sendKeys("Hyderabad");
				System.out.println("Enter from address");				
				Thread.sleep(2000);
				text.sendKeys(Keys.ENTER);
	/*List<WebElement>	list =driver.findElements(By.xpath("//input[@tabindex='4']"));
	for(WebElement ele : list) {
		ele.sendKeys("Hyderabad");
		//String get = ele.getAttribute("innerHtml");
		//System.out.println(get);
	}*/

	WebDriverWait wait2 = new WebDriverWait(driver, 20);
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='5']")));
		
		WebElement  list1 =  driver.findElement(By.xpath("//input[@tabindex='5']"));
		list1.sendKeys("Mumbai");
		System.out.println("Enter to address");
		Thread.sleep(2000);
		list1.sendKeys(Keys.ENTER);
		
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='roundtrip_picker']/div/span")));
		WebElement cal =driver.findElement(By.xpath("//div[@id='roundtrip_picker']/div/span"));
		cal.click();
		System.out.println(cal.isDisplayed());
		System.out.println("Click in calender");
		
		
		String date = "10-April 2019";
		String splitter[] = date.split("-");
		String checkinmonth_year = splitter[1];
		String checkinday = splitter[0];
		System.out.println(checkinmonth_year);
		System.out.println(checkinday);
		
		
		WebDriverWait wait4 = new WebDriverWait(driver, 20);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='rsdc-months']")));
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='rsdc-months']"));
		        for(int i = 0; i<elements.size(); i++) {
		        	//System.out.println(elements.get(i).getText());
		        	if(elements.get(i).getText().equals(checkinmonth_year));
		        	
		        }
				
		
		
		

	}

}
