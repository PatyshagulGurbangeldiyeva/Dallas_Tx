Feature: As an Admin Add Employee Work Experience

  Background: 
    And user is logged with valid admin credentials
    Then user navigated Employee Information page
    And user enters valid employee id "10774" and save
    Then user click to Employee id in the table
    And user click to "Qualification" and Click Add button

  @sendKeys
  Scenario Outline: Add Employee Work Experience by sendingKeys to Calender
    And user click to "Qualification" and Click Add button
    Then user send "<CompanyName>","<JobTitle>","<FromDate>","<ToDate>","<Comment>"
    And user click to save button

    Examples: 
      | CompanyName | JobTitle | FromDate    | ToDate      | Comment                                                                               |  
      | Walmart     | Manager  | 2018-Feb-15 | 2020-Jun-13 | I was warked in Walmart as manager, and I have great experience in handlign team work |  

  @calender
  Scenario: Add Employee Work Experience by selecting calender
    When user send companyName, jobTitle and comment
      | companyName | jobTitle  | comment                                                   |
      | Dallas_TX   | QA tester | I have worked in this sphere and got a lot of experiences |
    And user select fromDate from calender
    And user select toDate from Calender
    Then user click to save button
