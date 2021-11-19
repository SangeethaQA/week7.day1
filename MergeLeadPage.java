package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.CreateLeadMethods;

public class MergeLeadPage extends CreateLeadMethods{
	

	public MergeLeadPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public MergeLeadPage verifyMergeLead()
	
	{
		boolean fromLead= driver.findElementById("ComboBox_partyIdFrom").isDisplayed();
			Assert.assertTrue(fromLead);
			return this;
			
		}
	public MergeLeadPage fromLead(String fromName) throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fromName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	
	public MergeLeadPage toLead(String toName) throws InterruptedException 
	{
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(toName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		return this;
		
	}
	

	public MergeLeadPage clickMerge() 
	{
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return this;
		
	}
	
	public FindLeadPage clickFindLead() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
	}
}

