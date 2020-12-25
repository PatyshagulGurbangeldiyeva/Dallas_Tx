Feature: As an admin I should be able to change employee's contact details

  Scenario: 
    And user is logged with valid admin credentials
    Then user navigated Employee Information page
    And user enters valid employee id "10774" and search
    Then user click to Employee id in the table
    And user click to Contact Details and changes informations
    When user completes changes and saves 
      | AddressStreet2 | State/Province | Country       |  
      | AAAAAAA        | Alaska         | United States |  
    Then user validates information
