package test;

import org.testng.annotations.Test;

import Base.CreateLeadMethods;
import pages.LoginPage;

public class DuplicateLeadTest extends CreateLeadMethods{
	
	@Test
	public void runDuplicateLead() throws InterruptedException{
		new LoginPage(driver)
		.enterUserName()
		.enterPassword().clickLogin().
		clickCRMSFA()
		.verifyLead().
		clickLead().
		verifyMyLeads().clickFindLead().
		selectPhoneTab().
		enterPhoneNo().
		clickFindLeadButton().selectFirstRow().clickDuplicateLead().
		verifyDuplicateLead().
		clickCreateLead();
	}
}
