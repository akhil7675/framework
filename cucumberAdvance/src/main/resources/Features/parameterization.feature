#Parameterization and data driven
Feature: feature to test login functionality with parameters

  Scenario Outline: Check login is succesfull with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login page
    Then user is navigated to the home

    Examples: 
      | username | password | country |
      | akhil    |    12345 | India   |
      | sunil    |    12345 | germany |
