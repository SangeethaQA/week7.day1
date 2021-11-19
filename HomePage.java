package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.CreateLeadMethods;

public class HomePage extends CreateLeadMethods {
	
	public HomePage(ChromeDriver driver)
	{
	 this.driver=driver;
	}
	
	
	public HomePage verifyHomePage()
	{
		boolean crm =driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(crm);
		return this;
		
	}
	
	public MyHomePage clickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage(driver);
		
	}
	
	
	

}
