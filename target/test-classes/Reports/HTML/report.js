$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/ForgotPassword.feature");
formatter.feature({
  "name": "Forgot Password Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the forgotten password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_the_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile number or email",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_the_mobile_number_or_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in reset password page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_in_reset_password_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "Login functionality of Facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check login invalid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid username and invalid password",
  "rows": [
    {
      "cells": [
        "sel",
        "jav"
      ]
    },
    {
      "cells": [
        "sel4",
        "jav1"
      ]
    },
    {
      "cells": [
        "sel5",
        "jav2"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_invalid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user must be in invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_must_be_in_invalid_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To check login valid username and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and valid password",
  "rows": [
    {
      "cells": [
        "selenium",
        "java"
      ]
    },
    {
      "cells": [
        "selinum4",
        "java1"
      ]
    },
    {
      "cells": [
        "seeniuml5",
        "java2"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_valid_username_and_valid_password(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 5, Size: 2\r\n\tat java.util.ArrayList.rangeCheck(Unknown Source)\r\n\tat java.util.ArrayList.get(Unknown Source)\r\n\tat java.util.Collections$UnmodifiableList.get(Unknown Source)\r\n\tat org.stepdefinition.LoginStepDefinition.user_enters_valid_username_and_valid_password(LoginStepDefinition.java:59)\r\n\tat ✽.user enters valid username and valid password(file:src/test/resources/FeatureFiles/Login.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user must be in invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_must_be_in_invalid_credentials_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});