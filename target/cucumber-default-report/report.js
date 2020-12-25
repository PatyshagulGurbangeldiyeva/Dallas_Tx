$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddWorkExp.feature");
formatter.feature({
  "name": "As an Admin Add Employee Work Experience",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add Employee Work Experience by sendingKeys to Calender",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sendKeys"
    }
  ]
});
formatter.step({
  "name": "user click to \"Qualification\" and Click Add button",
  "keyword": "And "
});
formatter.step({
  "name": "user send \"\u003cCompanyName\u003e\",\"\u003cJobTitle\u003e\",\"\u003cFromDate\u003e\",\"\u003cToDate\u003e\",\"\u003cComment\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user click to save button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "CompanyName",
        "JobTitle",
        "FromDate",
        "ToDate",
        "Comment"
      ]
    },
    {
      "cells": [
        "Walmart",
        "Manager",
        "2018-Feb-15",
        "2020-Jun-13",
        "I was warked in Walmart as manager, and I have great experience in handlign team work"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.AddWorkExperienceSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigated Employee Information page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Project.steps.AddWorkExperienceSteps.user_navigated_Employee_Information_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid employee id \"10774\" and search",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.AddWorkExperienceSteps.user_enters_valid_employee_id_and_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to Employee id in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Project.steps.AddWorkExperienceSteps.user_click_to_Employee_id_in_the_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to \"Qualification\" and Click Add button",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.AddWorkExperienceSteps.user_click_to_Qualification_and_Click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee Work Experience by sendingKeys to Calender",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sendKeys"
    }
  ]
});
formatter.step({
  "name": "user click to \"Qualification\" and Click Add button",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.AddWorkExperienceSteps.user_click_to_Qualification_and_Click_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send \"Walmart\",\"Manager\",\"2018-Feb-15\",\"2020-Jun-13\",\"I was warked in Walmart as manager, and I have great experience in handlign team work\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Project.steps.AddWorkExperienceSteps.user_send(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.Project.steps.AddWorkExperienceSteps.user_click_to_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Add Employee Work Experience by sendingKeys to Calender");
formatter.after({
  "status": "passed"
});
});