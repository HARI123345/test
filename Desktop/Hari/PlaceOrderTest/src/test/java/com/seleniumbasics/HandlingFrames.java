package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static WebDriver driver;

	public static void main(String[] args) {
           System.setProperty("webdriver.chrome.driver", "/home/haree/Desktop/chromedriver");
           
           driver = new ChromeDriver();
           driver.get("https://jqueryui.com/draggable/");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           
           //1st method
           
           /*List<WebElement> list = driver.findElements(By.tagName("iframe"));
           System.out.println(list.size());
           
           driver.switchTo().frame(0);
           WebElement box = driver.findElement(By.xpath("//div[@id='draggable']"));
           System.out.println(box.getText());
           
           driver.switchTo().defaultContent();
           WebElement ele = driver.findElement(By.xpath("//div[@id='content']/h1[text()='Draggable']"));
           System.out.println(ele.getText());
           */
           
           
           //2rd method
           
           WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
           
           driver.switchTo().frame(frame);
           WebElement box = driver.findElement(By.xpath("//div[@id='draggable']"));
           System.out.println(box.getText());
           driver.switchTo().defaultContent();
           WebElement ele = driver.findElement(By.xpath("//div[@id='content']/h1[text()='Draggable']"));
           System.out.println(ele.getText());
           
           
           
           
	}

}
