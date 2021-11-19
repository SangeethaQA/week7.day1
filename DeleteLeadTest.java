package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.CreateLeadMethods;
import pages.LoginPage;

public class DeleteLeadTest extends CreateLeadMethods{
	
	@Test
	public void runDeleteLead() throws InterruptedException{
		new LoginPage(driver)
		.enterUserName()
		.enterPassword().clickLogin().
		clickCRMSFA()
		.verifyLead().
		clickLead().
		verifyMyLeads().clickFindLead().
		selectPhoneTab().
		enterPhoneNo().
		clickFindLeadButton().
		getLeadId().
		selectFirstRow().
		clickDelete().
		clickFindLead().
		enterLeadId(leadId).
		clickFindLeadButton().
		verifyNoRecords();
		

}
	

}