package com.Project.pages;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;


public class EmployeeInformationPageElements extends CommonMethods {
	
	@FindBy (id="empsearch_employee_name_empName")
	public WebElement empName;
	
	@FindBy (id="empsearch_id") //"10774"
	//@FindBy (xpath="//input[@name='empsearch[id]']")
	public WebElement empId;
	
	@FindBy (id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy (xpath="//table[@id='resultTable']//td[2]/a")
	public WebElement userId;
	
	public EmployeeInformationPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	
	
	public void searchById(String id) {
           //  sendText(empId,id);
		empId.sendKeys(id,Keys.ENTER);
		searchBtn.click();
		
	
	}
		
	public void searchByName(String Name) {
		empId.sendKeys(Name, Keys.ENTER);
	}

	
	public  void clickUserId() {
		click(userId);
	}

}
