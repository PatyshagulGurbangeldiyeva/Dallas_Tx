package com.Project.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Project.utils.CommonMethods;
import com.Project.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddWorkExperienceSteps extends CommonMethods{
	
	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	    login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Then("user navigated Employee Information page")
	public void user_navigated_Employee_Information_page() {
	    dashboard.navigateToEmployeeList();
	}

	@Then("user enters valid employee id {string} and search")
	public void user_enters_valid_employee_id_and_search(String id) {
	 //   employeeInfo.searchById(id);
		
//		employeeInfo.empId.sendKeys(id,Keys.ENTER);
//		wait(3);
		sendText(employeeInfo.empId,id);
		employeeInfo.searchBtn.click();
		
		
		
	}

	@Then("user click to Employee id in the table")
	public void user_click_to_Employee_id_in_the_table() {
		wait(3);
	    employeeInfo.clickUserId();
	}

	
	@Then("user click to {string} and Click Add button")
	public void user_click_to_Qualification_and_Click_Add_button(String qualification) {
	   // viewEmp.choose(viewEmp.personalDetails, qualification);
		viewEmp.chooseQualification(qualification);
	    addWorkExp.addBtn.click();
	}

	@Then("user send {string},{string},{string},{string},{string}")
	public void user_send(String company, String job, String yy_M_dd, String yy_MM_dd, String comment) {
//	    addWorkExp.sendWorkExp(company, job, yy_M_dd, yy_MM_dd, comment);
//	    wait(3);
		sendText(addWorkExp.companyName, company);
		sendText(addWorkExp.jobTitle,job );
		addWorkExp.sendFrom(yy_M_dd);
		addWorkExp.sendTo(yy_MM_dd);
		wait(3);
		sendText(addWorkExp.expirComment,comment);
		
	}

	@Then("user click to save button")
	public void user_click_to_save_button() {
	   addWorkExp.workExpSavebtn.click();
	}

	@When("user send companyName, jobTitle and comment")
	public void user_send_companyName_jobTitle_and_comment(DataTable dataTable) {
	   List<Map<String,String>> list=dataTable.asMaps();
	   
	   for (Map<String,String>map:list) {
		   
		   sendText(addWorkExp.companyName, map.get("companyName"));
		   sendText(addWorkExp.jobTitle,map.get("jobTitle"));
//		   sendText(addWorkExp.fromCalendar, map.get("FromDate"));
//		   sendText(addWorkExp.toCalendar, map.get("ToDate"));
		   
		   WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(addWorkExp.expirComment));
		   sendText(addWorkExp.expirComment, map.get("comment"));
	   }
	   
	}

	@When("user select fromDate from calender")
	public void user_select_fromDate_from_calender() {
	   addWorkExp.fromDate("6", "2007", "25");
	}

	@When("user select toDate from Calender")
	public void user_select_toDate_from_Calender() {
	   addWorkExp.toDate("6", "2007", "25");
	}


}
