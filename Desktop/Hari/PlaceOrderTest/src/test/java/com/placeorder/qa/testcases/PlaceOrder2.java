package com.placeorder.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PlaceOrder2 {
	public static void main(String str[])throws InterruptedException {
		
		/*System.out.println("Welcome back");
		
		System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		d.get("http://web40.aitcc.net/index.php/admin/");

		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		
		d.findElement(By.name("login[username]")).sendKeys("raja");
		System.out.println("Entered Raja");
		d.findElement(By.xpath("//input[@id='login']")).sendKeys("Redo@123");
		System.out.println("Entered Password");
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("Logged in");
		
		d.get("http://web40.aitcc.net/index.php/admin/sales_order_create/reorder/order_id/1386119/");

		Thread.sleep(3000);
		Select tf = new Select(d.findElement(By.xpath("//*[@id=\"order-items_grid\"]/table/tbody/tr/td[8]/select")));
		tf.selectByVisibleText("Remove");
		tf.selectByValue("remove");
		
			Actions rt = new Actions(d);
		rt.moveToElement(d.findElement(By.xpath("//*[@id=\"order-items\"]/div[2]/div[2]/table/tbody/tr/td[2]/button/span/span/span"))).click().build().perform();
		*/
	}
	
}
