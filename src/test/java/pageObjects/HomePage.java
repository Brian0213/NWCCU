package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//select[@name='inst_type']")
WebElement dropInstituition;	
	
@FindBy(xpath="//select[@name='inst_type']/option[@value='Any']")
WebElement instutitionTypeAny;	
	
@FindBy(xpath="//select[@name='inst_type']/option[@value='Public']")
WebElement instituitionTypePublic;

@FindBy(xpath="//select[@name='inst_type']/option[@value='Private for-profit']")
WebElement instituitionTypePrivateProfit;	

@FindBy(xpath="//select[@name='inst_type']/option[@value='Private non-profit']")
WebElement instituitionTypePrivateNonProfit;	

@FindBy(xpath="//select[@name='inst_type']/option[@value='4-year']")
WebElement instituitionType4year;	


public void clickInstituition()
{
	dropInstituition.click();
}

public void clickAny()
{
	instutitionTypeAny.click();
}

public void clickPublic()
{
	instituitionTypePublic.click();
}

public void clickPrivateProfit()
{
	instituitionTypePrivateProfit.click();
}

public void clickPrivateNProfit()
{
	instituitionTypePrivateNonProfit.click();
}

public void click4year()
{
	instituitionType4year.click();
}





}