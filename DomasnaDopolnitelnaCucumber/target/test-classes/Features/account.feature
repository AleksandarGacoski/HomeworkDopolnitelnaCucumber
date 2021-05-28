Feature: Customer create account

  Scenario: Successfull create account with new email address
    Given Navigate to automationpractice
    Then automation practice home page should be displayed
    When user clicks SignIn link button
    And enter new valid email address
    And click Create An Account BTN
    Then account creation page should be displayed
    When populate all mandatory fields
    And click on Register buton
    Then My account page should be dipslayed
