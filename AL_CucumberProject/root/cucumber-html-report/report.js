$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "This is Login feature of OrangeHRM",
  "description": "",
  "id": "this-is-login-feature-of-orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SimpleLogin"
    },
    {
      "line": 1,
      "name": "@Expression"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "This is Login scenario of OrangeHRM",
  "description": "",
  "id": "this-is-login-feature-of-orangehrm;this-is-login-scenario-of-orangehrm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User entering to Orange HRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Type the valid username as \"Admin\" and password as \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Press the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should be navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_entering_to_Orange_HRM_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 28
    },
    {
      "val": "admin123",
      "offset": 52
    }
  ],
  "location": "LoginStepDefinition.type_the_valid_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.press_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.the_user_should_be_navigated_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
});