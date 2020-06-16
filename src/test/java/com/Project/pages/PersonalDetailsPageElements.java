package com.Project.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;



public class PersonalDetailsPageElements extends CommonMethods{
	
	@FindBy(id="personal_txtEmpFirstName")
	public WebElement firstName;
	
	@FindBy(id="personal_txtEmpMiddleName")
	public WebElement  midName ;
	
	@FindBy(id= "personal_txtEmpLastName")
	public WebElement lastName;
	
	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;
	
	@FindBy(id="personal_txtOtherID")
	public WebElement empOtherId;
	
	@FindBy(xpath="//ul[@class='radio_list']/li ")
	public List<WebElement> genderlist;
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement driverLicenceNo;
	
	@FindBy(xpath="//input[@id='personal_txtLicExpDate']/following-sibling::img")// calendar
	public WebElement licExpDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")// calendar
	public WebElement selctmonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")// calendar
	public WebElement selctyear;
	
	@FindBy(xpath="//a[@title='Next']")// calendar
	public WebElement nextBtn;
	
	@FindBy(xpath="//a[@title='Prev']")// calendar
	public WebElement previousBtn;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/thead/tr/th")// calendar/ datys (Monday ,...)
	public WebElement dayNames;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr")// date number rows
	public WebElement dateRows;
	
	@FindBy(id="personal_txtLicExpDate") //sending keys 2021-Aug-14
	public WebElement licExpDateSendKeys;
	
	@FindBy(id="personal_txtNICNo")
	public WebElement SSNno;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement SINno;
	
	@FindBy(id="personal_optGender_1")
	public WebElement btnMale;
	
	@FindBy(id="personal_optGender_2")
	public WebElement btnFemale;
	
	@FindBy(id="personal_cmbMarital")
	public WebElement maritalStatus;

	@FindBy(id = "personal_cmbNation")
	public WebElement nationalityDD;
	
	@FindBy(id="personal_DOB") // sending keys to date of birth 2020-Jun-11
	public WebElement dateOfBorthSendKeys;
	
	@FindBy(name = "personal[optGender]")
	public List<WebElement> genderRadioGroup;

	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;

	@FindBy (id="personal_txtEmpNickName")
	public WebElement nickName;
	
	@FindBy(id="personal_chkSmokeFlag")
	public WebElement SmokerCheckbox;
	
	@FindBy(id="personal_txtMilitarySer")
	public WebElement miltaryservice;
	
	
	@FindBy(xpath="//div[@id='profile-pic']//h1")
	public WebElement profilePic;
	
	@FindBy(id="btnSave")
	public WebElement  btnEditAndSave;
	
	@FindBy(id="btnAddAttachment")
	public WebElement btnAdd;
	
	@FindBy(id="ufile")
	public WebElement chooseFile;
	
	@FindBy(id="txtAttDesc")
	public WebElement addComment;
	
	@FindBy (id="btnSaveAttachment")
	public WebElement btnSaveAttachment;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void selectInfo(String married, String nationality) {
		selectDdValue(maritalStatus,married);
		wait(2);
		selectDdValue(nationalityDD,nationality);
		
	}





public void ChangeLicExpDate(String exprmonth, String exprday, String expryear) {
	     licExpDate.click();
		selectDdValue(selctmonth,exprmonth);
		wait(2);
		selectDdValue(selctyear,expryear);
		
	
		
 List<WebElement>  datenumber=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));// calendar
		
 //for(WebElement date: pdetails.datenumber) {
		
		for(WebElement date: datenumber) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			if(date.getText().equals(exprday)) {
				date.click();
				break;
			}
   }
	
	
}
}

