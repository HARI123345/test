

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandler {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/haree/Desktop/Hari/chromedriver");
		 driver= new ChromeDriver(); 
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			 Thread.sleep(5000);
			//click on go btn
			driver.findElement(By.xpath("//input[@name='proceed']")).click();
			Alert alert = driver.switchTo().alert();
			
			System.out.print(alert.getText());
			String text = alert.getText();
//			if(text.equals("Please enter a valid user name")) {
//				
//				System.out.println("correct alert message ");
//				
//			}else {
//				System.out.println("in correct alert message");
//			}
			Thread.sleep(5000);
			System.out.println(text);
			alert.accept(); //click on ok btn
			//driver.quit();
			
			//alert.dismiss(); //click on cancel btn
			
	}

}
