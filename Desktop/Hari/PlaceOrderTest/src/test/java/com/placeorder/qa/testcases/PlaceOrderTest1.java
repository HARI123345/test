package com.placeorder.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceOrderTest1 {
	
	public static void main(String str[])throws InterruptedException {
	
		/*System.out.println("Welcome back");
	
	
	//public void readExcel() 
//		String FilePath = "C:\\Users\\raja.r\\Desktop\\Projects\\test\\sku.xls";
//		FileInputStream fs = new FileInputStream(FilePath);
//		Workbook wb = Workbook.getWorkbook(fs);
//
//		// TO get the access to the sheet
//		Sheet sh = wb.getSheet("Sheet1");
//
//		// To get the number of rows present in sheet
//		int totalNoOfRows = sh.getRows();
//
//		// To get the number of columns present in sheet
//		int totalNoOfCols = sh.getColumns();
//
				
		//*[@id="recaptcha-anchor-label"] 
			
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
			Thread.sleep(1000);
			d.get("http://web40.aitcc.net/index.php/admin/sales_order/view/order_id/1386119/");
			Thread.sleep(1000);
			d.get("http://web40.aitcc.net/index.php/admin/sales_order_create/reorder/order_id/1386119/");
			//1385690
			Thread.sleep(3000);
			/*d.findElement(By.xpath("//span[text()='Add Products']")).click();
			
			for (int row = 0; row < 250; row++) 
			{
			 int col = 0;			
			 String sku =	sh.getCell(col, row).getContents();
			 d.findElement(By.xpath("//*[@id='sales_order_create_search_grid_filter_sku']")).sendKeys(sku);
			 Thread.sleep(2000);
			 List <WebElement> abc = d.findElements(By.xpath("//button[@title='Search']/span/span/span"));
			 for(int j=0;j<abc.size();j++)
				{
					WebElement element = abc.get(j);
					String portlist=element.getText();
					if(portlist.equals("Search"))
					{
					element.click();
					}
				}	*/
		/*	 Thread.sleep(7000);
			 d.findElement(By.xpath("//table[@id='sales_order_create_search_grid_table']/tbody/tr[1]/td[5]/input")).click();
			 d.findElement(By.xpath("//button[@type='button']/span/span/span[text()='Add Selected Product(s) to Order']")).click();
			 Thread.sleep(6000);
			 js.executeScript("window.scrollBy(0,1200)");
			 Thread.sleep(3000);
			 d.findElement(By.xpath("//input[@id='p_method_cashondelivery']")).click();
			 Thread.sleep(7000);
			d.findElement(By.xpath("//div[@id='order-shipping-method-summary']/a")).click();
			 System.out.println("Clicked on Calculate shipping");
			 Thread.sleep(7000);
			
			 //d.findElement(By.xpath("//*[@id='order-shipping-method-choose']/dl/dd[2]/ul/li[2]/label")).click();
			//d.findElement(By.xpath("//div[@id='order-shipping-method-choose']/dl/dd[1]/ul/li[2]/label")).click();
			d.findElement(By.xpath("//div[@id='order-shipping-method-choose']/dl/dd[2]/ul/li[1]/label")).click();
			
			 Thread.sleep(9000);
			 js.executeScript("window.scrollBy(0,1000)");
			 d.findElement(By.xpath("//button[@title='Submit Order']")).click();
			 System.out.println("Order Placed Successfully ....");
			//*[@id="p_method_cashondelivery"]
			 Thread.sleep(13000);
			 d.get("http://web40.aitcc.net/index.php/admin/sales_order_create/reorder/order_id/1386119/");
			Thread.sleep(7000);
			
			 //d.findElement(By.xpath("//*[@id='order-items_grid']/table/tbody/tr/td[4]/input")).sendKeys("0");
			 //Thread.sleep(7000);
			//*[@id="order-items_grid"]/table/tbody/tr/td[8]/select/option[2]
			 	
		/*	 d.findElement(By.xpath("//span[text()='Add Products']")).click();
			 Thread.sleep(3000);
			 */
			 //d.quit();

		  //  d.findElement(By.xpath("//*[@id=\"id_c0a838bf4250e320c6c00095ef39de65\"]/span/span/span")).click(); 

			// d.findElement(By.xpath("//*[@id=\"id_2992cfe6433dad38c3d35be36679c7d6\"]")).click();
			 
		  } // End of Sku loop
	
	
	            
	             

	
	
	}

