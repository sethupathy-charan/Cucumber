Feature: Login functionality of Facebook application

  Scenario: To check login invalid username and invalid password
    When user enters invalid username and invalid password
      | sel  | jav  |
      | sel4 | jav1 |
      | sel5 | jav2 |
    And user clicks the login button
    Then user must be in invalid credentials page

  Scenario: To check login valid username and valid password
    When user enters valid username and valid password
      | selenium  | java  |
      | selinum4  | java1 |
      | seeniuml5 | java2 |
    And user clicks the login button
    Then user must be in invalid credentials page