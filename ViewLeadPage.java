package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.CreateLeadMethods;

public class ViewLeadPage extends CreateLeadMethods{
	
	public ViewLeadPage(ChromeDriver driver)
	{
	 this.driver= driver;
	}
	public ViewLeadPage verifyViewLead() {
	boolean text=driver.getTitle().contains("View Lead");
	Assert.assertTrue(text);
	return this;

	}
	public FindLeadPage clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	return new FindLeadPage(driver);

	}
	public EditLeadPage clickEdit()
	{
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public MyLeadsPage clickDelete()
	{
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);
	}
	
	public DuplicateLeadPage clickDuplicateLead()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
	
}
