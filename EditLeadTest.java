package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.CreateLeadMethods;
import pages.LoginPage;

public class EditLeadTest extends CreateLeadMethods
{
	
	@BeforeTest
	public void setValue()
	{
		excelfilename="EditLead";
	}
	@Test(dataProvider="ProvideData")
	public void runEditLead(String companyName) throws InterruptedException{
	

		new LoginPage(driver)
		.enterUserName()
		.enterPassword().clickLogin().
		clickCRMSFA()
		.verifyLead().
		clickLead().
		verifyMyLeads().
		clickFindLead().selectPhoneTab().
		enterPhoneNo().clickFindLeadButton().
		selectFirstRow().verifyViewLead().
		clickEdit().
		verifyEditLead().editCompanyName(companyName).
		clickUpdate();
	
		
				
		
	}

}
