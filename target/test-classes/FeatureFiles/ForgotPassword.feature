Feature: Forgot Password Functionality

  Scenario: 
    Given user is in facebook login page
    When user clicks the forgotten password
    And user enters the mobile number or email
    Then user is in reset password page
