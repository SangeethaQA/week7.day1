package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.CreateLeadMethods;

public class CreateLeadPage extends CreateLeadMethods{
	
	public CreateLeadPage(ChromeDriver driver)
	{
	 this.driver=driver;
	}
	
	public CreateLeadPage verifyCreateLead()
	{ boolean company =driver.findElement(By.id("createLeadForm_companyName")).isDisplayed();
		Assert.assertTrue(true);
		return this;

	}
	
	public CreateLeadPage enterCompanyName(String companyName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
		
	}
	public CreateLeadPage enterCompanyFirstName(String firstName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
		
	}
	public CreateLeadPage enterCompanyLastName(String lastName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
		
	}
	public CreateLeadPage enterCompanyPhone()
	{
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;
		
	}
	
	public ViewLeadPage clickCreateLead()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
		
	}

}
