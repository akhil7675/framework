Feature: to test tags



  @Smoke
  Scenario: scenario1
    Given "user Given"
    When  "user When"
    And   "user And" 
    Then  "user Then"
 @Regression
  Scenario: scenario2
    Given "user Given"
    When  "user When"
    And   "user And" 
    Then  "user Then"
 @Regression @Smoke
  Scenario: scenario3
    Given "user Given"
    When  "user When"
    And   "user And" 
    Then  "user Then"
    