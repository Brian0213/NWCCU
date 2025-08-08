package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

/*
 Data is valid - login success - test pass - logout
 Data is valid -- login failed - test fail
 
 Data is invalid - login success - test fail - logout
 Data is invalid -- login failed -- test pass 
 */

public class TC02_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class, groups="datadriven") // getting data provider from different classes.
	public void verify_loginDDT(String email, String pwd, String exp)
	{
		logger.info("********Starting Data Driven Login Test*********");
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Define the LoginPage Driver");
		
		lp.setEmail(email);
		logger.info("Enter the Email Address");
		
		lp.setPassword(pwd);
		logger.info("Enter Password");
		
		lp.clickSigin();
		logger.info("Click the the Sigin Button");
		lp.clickUserMenu();
		logger.info("Click the User Menu");
		lp.clickSignOut();
		logger.info("Click the Button");
		
		logger.info("********Data Driven Login Test Completed*********");
	}

}
