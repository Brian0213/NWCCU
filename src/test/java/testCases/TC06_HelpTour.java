package testCases;


import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC06_HelpTour extends BaseClass {
	
	@Test(groups={"Regression","Master"})
	public void InstituteType_process() throws InterruptedException
	{
		logger.info("********Starting Institution Type Test*********");
		
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
		hp.clickInstituition();
		hp.clickPublic();

		
		logger.info("********Institution Type Test Completed*********");
	}
	
	

}
