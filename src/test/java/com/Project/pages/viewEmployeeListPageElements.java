package com.Project.pages;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;

public class viewEmployeeListPageElements extends CommonMethods {

	@FindBy(xpath = "//ul[@id='sidenav']/li")
	public List<WebElement> personalDetails;
	
	@FindBy(xpath="//ul[@id='sidenav']//li[10]/a")
	public WebElement qualification;

	@FindBy(xpath="//ul[@id='sidenav']//li[2]/a")
	public WebElement contactDetails;
	
	public viewEmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	
	
	
	public void choose(List<WebElement> personalDetails, String textToSelect) {

		
		for (WebElement detail : personalDetails) {
			if (detail.getText().equals(textToSelect))
				
			detail.click();
			break;

		}
	}
	
	public void chooseQualification(String textToSelect) {
		qualification.click();
	}
	
	public void chooseContactDetails() {
		contactDetails.click();
	}

}
