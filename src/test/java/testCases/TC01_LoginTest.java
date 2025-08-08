package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC01_LoginTest extends BaseClass {
	
	
	@Test(groups={"Sanity","Master"})
	public void login_process() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		
		logger.info("********Starting Sign to Data Portal Test*********");
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Define the LoginPage Driver");
		
		lp.setEmail(p.getProperty("email"));
		logger.info("Enter the Email Address");
		
		lp.setPassword(p.getProperty("password"));
		logger.info("Enter Password");
		
		lp.clickSigin();
		logger.info("Click the the Sigin Button");
		lp.clickUserMenu();
		lp.clickSignOut();
		
		logger.info("********Sign to Data Portal Test Completed*********");
	}


}
