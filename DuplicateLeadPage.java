package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.CreateLeadMethods;

public class DuplicateLeadPage extends CreateLeadMethods{
	
	public DuplicateLeadPage(ChromeDriver driver)
	{
	 this.driver= driver;
	}
	public DuplicateLeadPage verifyDuplicateLead() {
	boolean text=driver.findElementById("createLeadForm_companyName").isDisplayed();
	Assert.assertTrue(text);
	return this;

	}
	
	public ViewLeadPage clickCreateLead() {
		driver.findElementByName("submitButton").click();
	
		return new ViewLeadPage(driver);

		}
	
}
