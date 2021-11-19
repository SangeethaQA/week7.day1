package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.CreateLeadMethods;

public class MyHomePage extends CreateLeadMethods {

	

	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}





	public MyHomePage verifyLead()

	{
		boolean lead = driver.findElement(By.linkText("Leads")).isDisplayed();
		Assert.assertTrue(lead);
		return this;
	}

	public MyLeadsPage clickLead()

	{
		driver.findElement(By.linkText("Leads")).click();

		return new MyLeadsPage(driver);
	}
}
