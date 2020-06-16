package com.Project.pages;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;

public class viewEmployeeListPageElements extends CommonMethods {

	@FindBy(id = "sidenav")
	public List<WebElement> personalDetails;
	
	@FindBy(xpath="//ul[@id='sidenav']//li[10]/a")
	public WebElement qualification;

	public viewEmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	
	
	
//	public void choose(List<WebElement> element, String textToSelect) {
//
//		for (WebElement detail : element) {
//			if (detail.getText().equals(textToSelect))
//				
//			detail.click();
//			break;
//
//		}
//	}
	
	public void chooseQualification(String textToSelect) {
		qualification.click();
	}

}
