package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.CreateLeadMethods;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;



public class CreateLeadTest extends CreateLeadMethods{
	
	@BeforeTest
	public void setValue()
	{
		excelfilename="CreateLead";
	}
	@Test(dataProvider="ProvideData")
	public void runCreateLead(String firstName,String lastName, String companyName){
	

		new LoginPage(driver)
		.enterUserName()
		.enterPassword().clickLogin().clickCRMSFA()
		.verifyLead().clickLead().verifyMyLeads().clickCreateLead().verifyCreateLead().
		 enterCompanyName(companyName).enterCompanyFirstName(firstName).enterCompanyLastName(lastName)
		 .clickCreateLead().verifyViewLead();
	
		
				
		
	}
}
