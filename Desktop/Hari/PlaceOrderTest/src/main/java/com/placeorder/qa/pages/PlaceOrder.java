package com.placeorder.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.placeorder.qa.base.TestBase;

public class PlaceOrder extends TestBase {
	
	//PageFactory
	//search
	@FindBy(xpath="//input[@id='search']")
	WebElement sear;
	//add-to-cart-btn
	@FindBy(xpath="//div[@class='add-to-cart-buttons']/button[@title='Buy Now']")
	WebElement addbtn;
	
	//cart-btn
	@FindBy(xpath="//*[@id='top']/body/div/div/div[1]/div/div/div/div[1]/ul/li/button/span/span")
	WebElement cartbtn;
	
	//loginbtn
	@FindBy(xpath="//div[@class='opc-menu']/p/a[text()='LOGIN']")
	WebElement lobtn;
	//email
	@FindBy(xpath="//input[@id='email']")
	WebElement em;
	
	//password
	@FindBy(xpath="//input[@id='pass']")
	WebElement pass;
	
	//btn
	@FindBy(xpath="//div[@id='login-button-set']/p[2]/button[text()='Login']")
	WebElement logbtn;
	
	//checkout  details
	@FindBy(xpath="//input[@title='First Name']")
	WebElement fnam;
	
	@FindBy(xpath="//input[@title='Last Name']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='billing:street1']")
	WebElement addr;
	
	
	@FindBy(xpath="//input[@id='billing:postcode']")
	WebElement postc;
	
	@FindBy(xpath="//input[@title='City']")
	WebElement ci;
	
	@FindBy(xpath="//input[@title='Telephone']")
	WebElement tel;
	
	//Initialization the page method
	public PlaceOrder() {
		PageFactory.initElements(driver, this);
		
					}
	
	//actions or methods
	public void placeOrderProduct(String search,String email, String password, String firstname, String lastname, String address, String pincode, String city, String telephone) throws InterruptedException {
			//,String email, String password, String firstname, String lastname, String address, String pincode, String city, String telephone ) throws InterruptedException {
		//search
		Assert.assertTrue(sear.isDisplayed());
		sear.sendKeys(search);
		System.out.println("search for products");
		
		Thread.sleep(3000);
		//get the all products
		List <WebElement> search1= driver.findElements(By.xpath("//div[@id='mCSB_1_container']/li"));
	      //System.out.println(search1.size());	
	      for(WebElement ele:search1) {
	    	  ele.click();
	      }
	      
	    //  System.out.println("Add-to-cart is open");
	      
	      Thread.sleep(1000);
	      
	      System.out.println("increase qty");
	      
	      
	      driver.findElement(By.xpath("//div[@class='add-to-cart-wrapper']/div[1]/div[1]/div[@class='qty-wrapper']/span[@class='plus']")).click();
	      
	      Thread.sleep(1000);
	      	//add-to-cart-btn

	      Assert.assertTrue(addbtn.isDisplayed());
	      addbtn.click();
	     System.out.println("click on add button");
	      
	      
	      //Cart-btn
	      
	      Thread.sleep(1000);
	      Assert.assertTrue(cartbtn.isDisplayed());
	      cartbtn.click();
	      System.out.println("click on cart button");
	      
	      //loginbtn
	      
	      Thread.sleep(1000);
	      Assert.assertTrue(lobtn.isDisplayed());
	     lobtn.click();
	     System.out.println("click on login button");
	      
	  	//email

	   Thread.sleep(1000);
	    Assert.assertTrue(em.isDisplayed());
	    em.sendKeys(email);
	    System.out.println("Enter email");
	      
		//password
	    Thread.sleep(1000);
       Assert.assertTrue(pass.isDisplayed());
       pass.sendKeys(password);
       System.out.println("enter pass");
        
        //btn
       Thread.sleep(1000);
       Assert.assertTrue(logbtn.isDisplayed());
       logbtn.click();
		System.out.println("click on login button");
       //dropdown
       Thread.sleep(2000);

	    Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='input-box']/select[@class='address-select']")));
	    dropdown.selectByVisibleText("New Address");
	    System.out.println("select a dropdown");
	    //checkout details
	    Thread.sleep(1000);
	    fnam.sendKeys(firstname);
	    System.out.println("Enter first name");
	    
	    Thread.sleep(1000);
	    lname.sendKeys(lastname);
	    System.out.println("Enter last name");
	    
	    Thread.sleep(1000);
	    addr.sendKeys(address);
	    System.out.println("Enter address");
	    Thread.sleep(1000);
	    postc.sendKeys(pincode);  
	    System.out.println("enter pincode");
	    
	    Thread.sleep(1000);
	    ci.sendKeys(city);
	    System.out.println("Enter city");
	    
	    Thread.sleep(1000);
	    tel.sendKeys(telephone);
	    System.out.println("enter telephone number");
	    WebElement opt1 = driver.findElement(By.xpath("//input[@name='billing[use_for_shipping]']"));							
		 opt1.click();
		 System.out.println("select check box ");
	    //driver.navigate().refresh();
		 //cod radio btn
	    Thread.sleep(1000);
	    WebElement element= driver.findElement(By.xpath("//input[@title='Cash On Delivery']"));
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", element);
	    System.out.println("select COD");
	  /*  
	    Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@id='checkout-review-submit']/button/span[1]/span[text()='Place Order Now']")).click();
	  	*/
//	     Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		System.out.print(alert.getText());
//		String text = alert.getText();
//        alert.dismiss();
	  //Thread.sleep(1000);
//	 
//      WebElement pay =  driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[1]/div/div/div[5]/div/a/i"));
//      Thread.sleep(3000);
//      pay.click();
	
//     System.out.println(ls.getText());
     //  ls.click();

    
	     
	 
	}

}
