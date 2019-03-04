package com.placeorder.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.placeorder.qa.base.TestBase;
import com.placeorder.qa.pages.PlaceOrder;
import com.placeorder.qa.util.TestUtil;

public class PlaceOrderTest extends TestBase {
	PlaceOrder placeorder;
	TestUtil testutil;
    String sheetName ="OrderTestData";
	
	public PlaceOrderTest() {
		super();
		
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		placeorder = new PlaceOrder();
	}
	//data driven framework
	 @DataProvider
     public Object[][] getPlaceOrderTestData( ) {
     	Object data[][] =TestUtil.getTestData(sheetName);
     	
     	return data;
     }	
	
	
//	@Test(priority=3, dataProvider="getGigFlexTestData2")
	

/*@Test(priority=1, dataProvider="getPlaceOrderTestData")
	public void validatePlaceOrderwithloginTest(String search, String email, String password, String firstname, String lastname, String address, String pincode, String city, String telephone) throws InterruptedException {
		String ty =  pincode;
		String ty1 = ty.replace(".0","" );
		//System.out.println(ty1);
		
	String ty2 =  telephone;
		String ty3 = ty2.replace("8.291364453E9","8291364453" );
		//System.out.println(ty3);
		
		//placeorder.placeOrderProduct("Nude pink Fringe Earings", "hari@esoftech.org", "hari@1234", "Hari", "Krishna", "Hari , B-012, Oshiwara Industrial Centre, Goregoan west, Mumbai, Maharashtra 400011, India", "400011", "Mumbai", "8291364899");
		placeorder.placeOrderProduct(search, email, password, firstname, lastname, address, ty1, city, ty3);
		
		System.out.println("");
	}
	
	
	/*@Test(priority=2)
	 public void validatePlaceOrderWithRegTest() throws InterruptedException {
	  Thread.sleep(1000);
      WebElement cat =  driver.findElement(By.xpath("//div[@id='header-nav']/nav/ol/li/a[text()='Earrings']"));
      Assert.assertTrue(cat.isDisplayed());
      cat.click();
      System.out.println("Click on category");
      
      
      
	}*/
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	}
	
	
}
