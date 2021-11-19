package Base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLeadMethods {
	public  ChromeDriver driver;
	public String excelfilename;
	public static String leadId;
	
	
	@BeforeMethod
	public void precondition()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	@DataProvider(name="ProvideData")
	public String [][] sendData() throws IOException{
	
		return util.ReadExcel.readData(excelfilename);

		
	}

}
