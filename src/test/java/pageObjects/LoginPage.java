package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
//		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@name='email']")
WebElement txtEmail;	
	
@FindBy(xpath="//input[@name='password']")
WebElement txtPassword;	
	
@FindBy(xpath="//button[@class='flex items-center justify-center w-full px-4 py-4 space-x-1 text-sm font-semibold leading-4 text-center transition-colors duration-300 bg-blue-600 rounded-md hover:bg-blue-700 text-blue-50']")
WebElement btnSignin;

@FindBy(xpath="//button[normalize-space()='Upload Data']")
WebElement btnUpload;	

@FindBy(xpath="//span[@class='text-sm font-medium text-slate-700 dark:text-slate-300']")
WebElement btnMenu;	

@FindBy(xpath="//button[normalize-space()='Sign Out']")
WebElement btnSignout;	

@FindBy(xpath="//button[normalize-space()='Apply']")
WebElement btnApply;	




public void setEmail(String email)
{
	txtEmail.clear();
	txtEmail.sendKeys(email);
}

public void setPassword(String pwd)
{   
	txtPassword.clear();
	txtPassword.sendKeys(pwd);
}

public void clickSigin()
{
	btnSignin.click();
}

public void clickUpload()
{
	btnUpload.click();
}

public void clickUserMenu()
{
	btnMenu.click();
}

public void clickSignOut()
{
	btnSignout.click();
}

public void clickApply()
{
	btnApply.click();
}


}

