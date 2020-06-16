package com.Project.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;

public class AddWorkExperiencePageElements extends CommonMethods {

	@FindBy(id = "addWorkExperience")
	public WebElement addBtn;

	@FindBy(id = "experience_employer")
	public WebElement companyName;

	@FindBy(id = "experience_jobtitle")
	public WebElement jobTitle;

	@FindBy(xpath = "//form[@id='frmWorkExperience']//li[3]//img") // calendar1
	public WebElement fromCalendar;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']//select[1]")
	public WebElement fromMonth;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']//select[2]")
	public WebElement fromYear;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tbody//tr/td")
	public List<WebElement> fromDays;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']//span")
	public WebElement nextbtn;

	@FindBy(id = "experience_from_date") // calender1 sendKeys
	public WebElement fromDateSendKeys;

	@FindBy(xpath = "//form[@id='frmWorkExperience']//li[4]//img") // calender2
	public WebElement toCalendar;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']//select[1]")
	public WebElement toMonth;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']//select[2]")
	public WebElement toYear;

						
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//td")
	public List<WebElement> toDays;

	@FindBy(id = "experience_to_date") // calender2 sendKeys
	public WebElement toDateSendKeys;

	@FindBy(id = "experience_comments")
	public WebElement expirComment;

	@FindBy(id = "btnWorkExpSave")
	public WebElement workExpSavebtn;
	
	public AddWorkExperiencePageElements() {
		PageFactory.initElements(BaseClass.driver, this);

	}
	
	public void sendFrom(String YearMonDay) {
		fromDateSendKeys.clear();
		fromDateSendKeys.sendKeys(YearMonDay,Keys.ENTER);
	}
	
	public void sendTo(String YearMonDay) {
		toDateSendKeys.clear();
		toDateSendKeys.sendKeys(YearMonDay,Keys.ENTER);
	}

	public void sendWorkExp(String company, String job, String yy_M_dd, String yy_MM_dd, String Comment) {
		wait(2);
		sendText(companyName, company);
		wait(2);
		sendText(jobTitle, job);
		wait(2);
		fromCalendar.sendKeys(yy_M_dd, Keys.ENTER);
		wait(2);
		toCalendar.sendKeys(yy_MM_dd, Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(addWorkExp.expirComment));
		addWorkExp.expirComment.sendKeys(Comment, Keys.ENTER);
		
	}

	public void fromDate(String month, String year, String day) {
		jsClick(fromCalendar);
		selectDdValue(fromMonth,month);
		selectDdValue(fromYear,year);
		

		for (WebElement fday : fromDays) {
			String fromText = fday.getText();

			if (fromText.equals(day)) {
				fday.click();
				break;
			}

		}
	}
	

	public void toDate(String month, String year, String day) {
		jsClick(toCalendar);

		selectDdValue(toMonth,month);
		selectDdValue(toYear,year);

			for (WebElement tday : toDays) {
				String fromText = tday.getText();

				if (fromText.equals(day)) {
					tday.click();
					break;

				}

			}
		}
	}

