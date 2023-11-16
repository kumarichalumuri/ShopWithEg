Feature: verify Login functionality

  @smoke @regression @tc1
  Scenario: verify login with valid credentials
    Given user launches shopWithEG application
    When user clicks on login link
    And user enters valid credentials
    And user clicks on signIn button
    Then user will be logged in

  @regression @tc2
  Scenario: verify login with valid credentials
    Given user launches shopWithEG application
    When user clicks on login link
    And user enters "test@test.com" and "welcome"
    And user clicks on signIn button
    Then user will be logged in

  @tc3
  Scenario Outline: verify login with valid credentials
    Given user launches shopWithEG application
    When user clicks on login link
    And user enters "<email>" and "<password>"
    And user clicks on signIn button
    Then user will be logged in
    
  @tc4
  Scenario: verify CreateAccount with valid credentials
    Given user launches shopWithEG application
    When user clicks on login link
    When user clicks on createaccount link  
    And user enters valid details for createaccount page
    And user clicks on createaccount button
    Then user will be created account
    
    
    Examples: 
      | email               | password  |
      | testemail1@test.com | password1 |
      | testemail2@test.com | password2 |
      | Praneeth@test.com   | Password3 |
