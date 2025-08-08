package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public BasePage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
