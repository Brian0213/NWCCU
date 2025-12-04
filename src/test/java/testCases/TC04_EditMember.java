package testCases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC04_EditMember extends BaseClass {
	
	String fname = "London";
	String lname = "Buckingham";
	String role = "Faculty";
	String email = "faculty@nighingale.edn";
	
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
		lp.clickUserMenu();
		hp.clickUserManage();
		hp.clickMember();
		hp.clickMemberFirstName(fname);
		hp.clickMemberLastName(lname);
		hp.clickMemberRole();
		hp.clickMemberRoleAdmin();
		hp.clickMemberEmail(email);

		
		logger.info("********Edit Member Test Completed*********");
	}
	
	

}
