Feature: verify CreateAccount functionality
Scenario: verify CreateAccount with valid credentials
    Given user launches shopWithEG application
    When user clicks on login link
    When user clicks on createaccount link
    And user enters valid details for createaccount page
    And user clicks on createaccount button
    Then user will be created account