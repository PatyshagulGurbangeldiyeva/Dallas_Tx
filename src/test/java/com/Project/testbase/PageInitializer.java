package com.Project.testbase;

import com.Project.pages.AddWorkExperiencePageElements;
import com.Project.pages.ContactDetailsPageElements;
import com.Project.pages.DashboardPageElements;

import com.Project.pages.EmployeeInformationPageElements;
import com.Project.pages.LoginPageElements;
import com.Project.pages.PersonalDetailsPageElements;
import com.Project.pages.viewEmployeeListPageElements;




//initializes all pages class and stores references in static variables
//that will called/used in test classes
public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	
	public static EmployeeInformationPageElements employeeInfo;
	public static viewEmployeeListPageElements viewEmp;
	public static AddWorkExperiencePageElements addWorkExp;
	
	public static ContactDetailsPageElements contDetail;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		pdetails=new PersonalDetailsPageElements();
		
		employeeInfo=new EmployeeInformationPageElements();
		viewEmp=new viewEmployeeListPageElements();
		addWorkExp=new AddWorkExperiencePageElements();
		contDetail= new ContactDetailsPageElements();
	
	}
}
