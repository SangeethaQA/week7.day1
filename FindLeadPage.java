package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.CreateLeadMethods;

public class FindLeadPage extends CreateLeadMethods{
	
	
	public FindLeadPage(ChromeDriver driver)
	{
	 this.driver= driver;
	}


public FindLeadPage clickFindLead()
{
	driver.findElement(By.linkText("Find Leads")).click();
	return this;
}

public FindLeadPage selectPhoneTab()
{
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
}
public FindLeadPage enterPhoneNo()
{
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	return this;
}
public FindLeadPage clickFindLeadButton()
{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
}
public ViewLeadPage selectFirstRow() throws InterruptedException
{	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new ViewLeadPage(driver);
}

public FindLeadPage getLeadId() throws InterruptedException
{
	Thread.sleep(2000);
	leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	return this;
}

public FindLeadPage enterLeadId(String leadId)
{
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
	return this;
}

public FindLeadPage verifyNoRecords() throws InterruptedException
{	Thread.sleep(2000);
	String text = driver.findElement(By.className("x-paging-info")).getText();
	Assert.assertEquals(text, "No records to display");
	return this;
}


}
