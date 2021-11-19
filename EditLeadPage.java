package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.CreateLeadMethods;

public class EditLeadPage extends CreateLeadMethods{
	
	public EditLeadPage(ChromeDriver driver)
	{
	 this.driver= driver;
	}
	
	public EditLeadPage verifyEditLead()
	{
		
		boolean update=driver.findElement(By.id("updateLeadForm_companyName")).isDisplayed();
		Assert.assertTrue(update);
		return this;
	}
	
	public EditLeadPage editCompanyName(String companyName)
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		return this;
	}

	public ViewLeadPage clickUpdate()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}

	
	

}
