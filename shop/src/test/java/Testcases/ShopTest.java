package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import shopBase.Baseclass;

public class ShopTest  extends Baseclass
{
	@Test(dataProvider = "Details",priority = 0)
public static void SigninTest(String mailid) throws InterruptedException {
		
	driver.findElement(By.xpath(loc.getProperty("Signin"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("Email"))).sendKeys(mailid);
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("create-acc"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("Title"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("Firstname"))).sendKeys("Sudheer");
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("Lastname"))).sendKeys("V");
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys("hihello@1");
	Thread.sleep(3000);
	WebElement day = driver.findElement(By.xpath(loc.getProperty("DD")));
	day.click();
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.xpath(loc.getProperty("MM")));
	month.click();
	Thread.sleep(3000);
	WebElement year = driver.findElement(By.xpath(loc.getProperty("YY")));
	year.click();
	Thread.sleep(3000);
	
	Select sel = new Select(day);
	sel.selectByIndex(5);
	Thread.sleep(3000);
	
	Select sel1 = new Select(month);
	sel1.selectByIndex(6);
	Thread.sleep(3000);
	
	Select sel2 = new Select(year);
	sel2.selectByIndex(33);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(loc.getProperty("NL-Checkbox"))).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(loc.getProperty("register"))).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(loc.getProperty("logout"))).click();
	Thread.sleep(3000);
	
	
}
	@DataProvider(name = "Details")
	public Object [][] Signindata()
	{
		return new Object[][] 
				{
			
			{"nani0@gmail.com"}
		};
	}
	
	
	@Test(dataProvider = "creditials",priority = 1)
	public static void LoginTest(String names,String password) throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("login"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys(names);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("submit"))).click();
		
		boolean Account = driver.findElement(By.xpath(loc.getProperty("my-account"))).isDisplayed();
		Assert.assertTrue(Account,"my-account tab should be visible after login");
		System.out.println(Account);
	}
		@DataProvider(name = "creditials")
		public Object [][] logindata()
		{
			return new Object[][] 
					{
//				{"nani@gmail","hinani@123"},
//				{"nani@gmail.com","hinani@1"},
//				{"nani@gmail.com","hinani"},
				{"nani123@gmail.com","hihello@1"}
				
			};
		}
		
		@Test(dataProvider = "creditials1",priority = 2)
		public static void AddMyAdd(String com,String address1,String address2,String city,String pin) throws InterruptedException {
			driver.findElement(By.xpath(loc.getProperty("add-address"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("company"))).sendKeys(com);
			Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("add1"))).sendKeys(address1);
			Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("add2"))).sendKeys(address2);
			Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("city"))).sendKeys(city);
			Thread.sleep(2000);
			WebElement state = driver.findElement(By.xpath(loc.getProperty("state")));
			state.click();
			Thread.sleep(3000);
			
			Select sel = new Select(state);
			sel.selectByIndex(15);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath(loc.getProperty("Pincode"))).sendKeys(pin);
			state.click();
			Thread.sleep(3000);
			
			//driver.findElement(By.xpath(loc.getProperty("submit"))).click();
			
			
		}
			@DataProvider(name = "creditials1")
			public Object [][] Add_aaddressdata()
			{
				return new Object[][] 
						{
					{"NeoGen","Beside Bhandan bank,subbaraju street","Ravulapalem","Rajahamundry","533238"}
					
					
				};
			}
		
		
	
}
