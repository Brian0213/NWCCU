package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//select[@x-model='filters.institutionType']")
WebElement dropInstituition;	
	
@FindBy(xpath="//select[@name='inst_type']/option[@value='Any']")
WebElement instutitionTypeAny;	
	
@FindBy(xpath="//select[@x-model='filters.institutionType']/option[@value='Public']")
WebElement instituitionTypePublic;

@FindBy(xpath="//select[@x-model='filters.institutionType']/option[@value='Private for-profit']")
WebElement instituitionTypePrivateProfit;	

@FindBy(xpath="//select[@x-model='filters.institutionType']/option[@value='Private non-profit']")
WebElement instituitionTypePrivateNonProfit;	

@FindBy(xpath="//select[@x-model='filters.institutionType']/option[@value='4-year']")
WebElement instituitionType4year;	

@FindBy(xpath="//select[@x-model='filters.institutionType']/option[@value='2-year']")
WebElement instituitionType2year;	

@FindBy(xpath="//select[@x-model='filters.institutionType']/option[@value='<2-year']")
WebElement instituitionTypeLessThan2year;	

@FindBy(xpath="//select[@x-model='filters.calendarSystem']")
WebElement fieldCalendar;	

@FindBy(xpath="//select[@x-model='filters.calendarSystem']/option[@value='Any']")
WebElement calendarAny;

@FindBy(xpath="//select[@x-model='filters.calendarSystem']/option[@value='Semester']")
WebElement calendarSemester;

@FindBy(xpath="//select[@x-model='filters.calendarSystem']/option[@value='Quarter']")
WebElement calendarQuarter;

@FindBy(xpath="//select[@x-model='filters.calendarSystem']/option[@value='Trimester']")
WebElement calendarTrimester;

@FindBy(xpath="//select[@x-model='filters.deliveryMethod']")
WebElement deliveryMethod;

@FindBy(xpath="//select[@x-model='filters.deliveryMethod']/option[@value='Any']")
WebElement deliveryAny;

@FindBy(xpath="//select[@x-model='filters.deliveryMethod']/option[@value='Full-Distance']")
WebElement deliveryFullDistance;

@FindBy(xpath="//select[@x-model='filters.deliveryMethod']/option[@value='Blended']")
WebElement deliveryBlended;

@FindBy(xpath="//select[@x-model='filters.deliveryMethod']/option[@value='Full-Residential']")
WebElement deliveryFullResidential;

@FindBy(xpath="//select[@x-model='filters.levelOfAward']")
WebElement levelofAward;

@FindBy(xpath="//select[@x-model='filters.levelOfAward']/option[@value='Any']")
WebElement awardAny;

@FindBy(xpath="//select[@x-model='filters.levelOfAward']/option[@value='Certificate']")
WebElement awardCertificate;

@FindBy(xpath="//select[@x-model='filters.levelOfAward']/option[@value='Diploma']")
WebElement awardDiploma;

@FindBy(xpath="//*[@id=\"awards\"]/option[5]")
WebElement awardAssociate;

@FindBy(xpath="//*[@id=\"awards\"]/option[6]")
WebElement awardBachelor;

@FindBy(xpath="//*[@id=\"awards\"]/option[7]")
WebElement awardMaster;

@FindBy(xpath="//select[@x-model='filters.levelOfAward']/option[@value='Doctoral']")
WebElement awardDoctoral;

@FindBy(xpath="//select[@x-model='filters.studentPopulation']")
WebElement studentPopulation;

@FindBy(xpath="//select[@x-model='filters.studentPopulation']/option[@value='Any']")
WebElement studentAny;

@FindBy(xpath="//select[@name='student_pop_range']/option[@value='0-500']")
WebElement student500;

@FindBy(xpath="//select[@x-model='filters.studentPopulation']/option[@value='501-1000']")
WebElement student1000;

@FindBy(xpath="//select[@x-model='filters.studentPopulation']/option[@value='1001-3000']")
WebElement student3000;

@FindBy(xpath="//select[@x-model='filters.studentPopulation']/option[@value='3001-5000']")
WebElement student5000;

@FindBy(xpath="//select[@x-model='filters.studentPopulation']/option[@value='5001-10000']")
WebElement student10000;

@FindBy(xpath="//select[@x-model='filters.studentPopulation']/option[@value='10001-15000']")
WebElement student15000;

@FindBy(xpath="//select[@x-model='filters.studentPopulation']/option[@value='15001-20000']")
WebElement student20000;

@FindBy(xpath="//select[@x-model='filters.studentPopulation']/option[@value='20000+']")
WebElement student20000plus;

@FindBy(xpath="//input[@name='first_name']")
WebElement editMemberFirstName;

@FindBy(xpath="//input[@name='last_name']")
WebElement editMemberLastName;

@FindBy(xpath="//select[@name='role']")
WebElement editMemberRole;

@FindBy(xpath="//select[@name='role']/option[@value='user']")
WebElement editMemberRoleUser;

@FindBy(xpath="//select[@name='role']/option[@value='admin']")
WebElement editMemberRoleAdmin;

@FindBy(xpath="//input[@name='email']")
WebElement editMemberEmail;

@FindBy(xpath="//button[normalize-space()='Save']")
WebElement editMemberSave;

@FindBy(xpath="//span[@class='text-sm font-medium text-white']")
WebElement btUserMenu;

@FindBy(xpath="//a[normalize-space()='Manage']")
WebElement btnUserManage;

@FindBy(xpath="//body/main/div/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[7]/button[1]")
WebElement btnMember;

@FindBy(xpath="//a[normalize-space()='Institutions']")
WebElement btnInstitutions;

@FindBy(xpath="//span[normalize-space()='+ Add Institution']")
WebElement btnAddInstitution;

@FindBy(xpath="//input[@name='name']")
WebElement txtCollegeName;

@FindBy(xpath="//input[@name='website']")
WebElement txtWebsite;

@FindBy(xpath="//button[normalize-space()='Cancel']")
WebElement btnCancel;

@FindBy(xpath="//button[normalize-space()='Create']")
WebElement btnCreate;

@FindBy(xpath="//button[normalize-space()='Help Tour']")
WebElement btnHelpTour;

@FindBy(xpath="//button[normalize-space()='Next']")
WebElement btnAddData;

@FindBy(xpath="//button[normalize-space()='Next']")
WebElement btnDataViews;

@FindBy(xpath="//button[normalize-space()='Next']")
WebElement btnTableOrChartView;

@FindBy(xpath="//button[normalize-space()='Next']")
WebElement btnFilterData;

@FindBy(xpath="//button[normalize-space()='Next']")
WebElement btnQuickActions;

@FindBy(xpath="//button[normalize-space()='Finish']")
WebElement btnfinishSelectInstitutions;

@FindBy(xpath="//button[normalize-space()='Back']")
WebElement backHelpTour;

@FindBy(xpath="//button[normalize-space()='Skip']")
WebElement skipHelpTour;

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


public void click2year()
{
	instituitionType2year.click();
}

public void clickless2year()
{
	instituitionTypeLessThan2year.click();
}

public void clickCalenderField()
{
	fieldCalendar.click();
}

public void clickOptionAny()
{
	calendarAny.click();
}

public void clickOptionSemester()
{
	calendarSemester.click();
}

public void clickOptionQuarter()
{
	calendarQuarter.click();
}

public void clickOptionTrimester()
{
	calendarTrimester.click();
}

public void clickDeliveryMethod()
{
	deliveryMethod.click();
}

public void clickDeliveryAny()
{
	deliveryAny.click();
}

public void clickDeliveryFullDistance()
{
	deliveryFullDistance.click();
}

public void clickDeliveryBlended()
{
	deliveryBlended.click();
}

public void clickDeliveryFullResidential()
{
	deliveryFullResidential.click();
}

public void clickLevelofAward()
{
	levelofAward.click();
}

public void clickAwardAny()
{
	awardAny.click();
}

public void clickAwardCerificate()
{
	awardCertificate.click();
}

public void clickAwardDiploma()
{
	awardDiploma.click();
}

public void clickAwardAssociate()
{
	awardAssociate.click();
}

public void clickAwardBachelor()
{
	awardBachelor.click();
}


public void clickAwardMaster()
{
	awardMaster.click();
}

public void clickAwardDoctoral()
{
	awardDoctoral.click();
}

public void clickStudentPopulation()
{
	studentPopulation.click();
}

public void clickStudPop500()
{
	student500.click();
}

public void clickStudPop1000()
{
	student1000.click();
}

public void clickStudPop3000()
{
	student3000.click();
}

public void clickStudPop5000()
{
	student5000.click();
}

public void clickStudPop10000()
{
	student10000.click();
}

public void clickStudPop15000()
{
	student15000.click();
}

public void clickStudPop20000()
{
	student20000.click();
}

public void clickStudPop20000plus()
{
	student20000plus.click();
}

public void clickMemberFirstName(String fname)
{
	editMemberFirstName.clear();
	editMemberFirstName.sendKeys(fname);
}

public void clickMemberLastName(String lname)
{
	editMemberLastName.clear();
	editMemberLastName.sendKeys(lname);;
}

public void clickMemberRole(String role)
{
	editMemberRole.clear();
	editMemberRole.sendKeys(role);
}

public void clickMemberRole()
{
	editMemberRole.click();
}

public void clickMemberRoleUser()
{
	editMemberRoleUser.click();
}

public void clickMemberRoleAdmin()
{
	editMemberRoleAdmin.click();
}

public void clickMemberEmail(String email)
{
	editMemberEmail.clear();
	editMemberEmail.sendKeys(email);;
}

public void clickMemberSave()
{
	editMemberSave.clear();
	editMemberSave.click();
}

public void clickUserMenu()
{
	btUserMenu.click();
}

public void clickUserManage()
{
	btnUserManage.click();
}

public void clickMember()
{
	btnMember.click();
}

public void clickInstitutions()
{
	btnInstitutions.click();
}

public void clickAddInstitution()
{
	btnAddInstitution.click();
}

public void enterCollegeName(String cname)
{
	txtCollegeName.clear();
	txtCollegeName.sendKeys(cname);
}

public void enterWebsite(String url)
{
	txtWebsite.clear();
	txtWebsite.sendKeys(url);
}

public void clickCancelButton()
{
	btnCancel.click();
}

public void clickCreateButton()
{
	btnCreate.click();
}

public void clickHelpTourButton()
{
	btnHelpTour.click();
}

public void clickAddDataNextButton()
{
	btnAddData.click();
}

public void clickDataViewsNextButton()
{
	btnDataViews.click();
}

public void clickTableOrChartViewNextButton()
{
	btnTableOrChartView.click();
}

public void clickFilterDataNextButton()
{
	btnFilterData.click();
}

public void clickQuickActionsNextButton()
{
	btnQuickActions.click();
}

public void clickfinishSelectInstitutionsNextButton()
{
	btnfinishSelectInstitutions.click();
}

public void clickbackHelpTourNextButton()
{
	backHelpTour.click();
}

public void clickskipHelpTourNextButton()
{
	skipHelpTour.click();
}


}