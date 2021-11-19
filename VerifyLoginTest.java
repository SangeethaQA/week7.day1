package test;

import org.testng.annotations.Test;

import Base.CreateLeadMethods;
import pages.LoginPage;

public class VerifyLoginTest  extends CreateLeadMethods {
	@Test
	public void runVerifyLogin(){
		LoginPage lp= new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin().verifyHomePage();
				
		
	}


}
