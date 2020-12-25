package com.Project.steps;



import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.Project.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ContactDetailsAdiingSteps extends CommonMethods{
	
	@Then("user click to Contact Details and changes informations")
	public void user_click_to_Contact_Details_and_changes_informations() {
	  viewEmp.chooseContactDetails();
	  contDetail.EditSaveBtn.click();
	}
	




	@When("user completes changes and saves")
	public void user_completes_changes_and_saves(DataTable dataTable) {
		List<Map<String,String>> info=dataTable.asMaps();
		 for (Map<String,String>map:info) {
			   sendText(contDetail.addStr2, map.get("AddressStreet2"));
			   sendText(contDetail.selcState,map.get("State/Province"));
			
			   selectDdValue(contDetail.selcCountry, map.get("Country"));
			   
			   contDetail.EditSaveBtn.click();
			   
		 }
		 
	}

	@Then("user validates information")
	public void user_validates_information() {
		
		String expectedValue="Alaska";
		String actualValue=contDetail.selcState.getAttribute("value");
		Assert.assertEquals(actualValue,expectedValue);
	}


}
