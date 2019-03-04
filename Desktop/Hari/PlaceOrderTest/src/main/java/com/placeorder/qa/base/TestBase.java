package com.placeorder.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

import com.placeorder.qa.util.TestUtil;



public class TestBase {

	public static ChromeDriver driver;
	 Logger log = Logger.getLogger(TestBase.class);
	//global variable
		public static Properties prop;
		
		public TestBase(){
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream("/home/haree/Desktop/Hari/PlaceOrderTest/src/main/java/com/placeorder/qa/config/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
			public static void initialization() throws InterruptedException {
				String browserName = prop.getProperty("browser");
				if(browserName.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver","/home/haree/Desktop/chromedriver");
					 driver= new ChromeDriver(); 
					 
				}
				/*else if(browserName.equals("FF")){
							System.setProperty("webdriver.gecko.driver", "/home/haree/Desktop/geckodriver");	
							driver = new FirefoxDriver(); 
						}*/
			
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
	}
}
