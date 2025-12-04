package testCases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC05_AddInstitution extends BaseClass {
	
	String cname = "StringLake University";
	String url = "www.stringlake.edu";

	
	@Test(groups={"Regression","Master"})
	public void InstituteType_process() throws InterruptedException
	{
		logger.info("********Starting Edit Member Test*********");
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Define the LoginPage Driver");
		
		HomePage hp=new HomePage(driver);
		logger.info("Define the HomePage Driver");
		
		lp.setEmail(p.getProperty("email"));
		logger.info("Enter the Email Address");
		
		lp.setPassword(p.getProperty("password"));
		logger.info("Enter Password");
		
		lp.clickSigin();
		logger.info("Click the the Sigin Button");
		hp.clickUserMenu();
		hp.clickUserManage();
		hp.clickInstitutions();
		hp.clickAddInstitution();
		hp.enterCollegeName(cname);
		hp.enterWebsite(url);
		hp.clickCancelButton();

		
		logger.info("********Add Institution Test Completed*********");
	}
	
	

}
