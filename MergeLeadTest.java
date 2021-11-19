package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.CreateLeadMethods;
import pages.LoginPage;

public class MergeLeadTest extends CreateLeadMethods{
	

	@BeforeTest
	public void setValue()
	{
		excelfilename="MergeLead";
	}
	@Test(dataProvider="ProvideData")
	public void runMergeLead(String fromName,String toName) throws InterruptedException{
		new LoginPage(driver)
		.enterUserName()
		.enterPassword().clickLogin().
		clickCRMSFA()
		.verifyLead().
		clickLead().
		verifyMyLeads().clickMergeLead().
		fromLead(fromName).
		toLead(toName).
		clickMerge().clickFindLead().
		enterLeadId(leadId).
		clickFindLeadButton().
		verifyNoRecords();
	

}
}
