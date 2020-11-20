$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/Eclipse workspace/Cucumber11.30/src/test/resources/log.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Facebook Login",
  "description": "",
  "id": "validate-facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "Home page user credential validation",
  "description": "",
  "id": "validate-facebook-login;home-page-user-credential-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enters Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"Praveen\" and \"Praveen\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User gets dirested  to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.User_enters_Url()"
});
formatter.result({
  "duration": 8662816100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Praveen",
      "offset": 13
    },
    {
      "val": "Praveen",
      "offset": 27
    }
  ],
  "location": "StepDef.User_enters_and(String,String)"
});
formatter.result({
  "duration": 189414700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.User_clicks_login_button()"
});
formatter.result({
  "duration": 70300200,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Home page user credential validation",
  "description": "",
  "id": "validate-facebook-login;home-page-user-credential-validation;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enters Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"Bala\" and \"Bala\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User gets dirested  to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.User_enters_Url()"
});
formatter.result({
  "duration": 7389153300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bala",
      "offset": 13
    },
    {
      "val": "Bala",
      "offset": 24
    }
  ],
  "location": "StepDef.User_enters_and(String,String)"
});
formatter.result({
  "duration": 167076300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.User_clicks_login_button()"
});
formatter.result({
  "duration": 71877500,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "Home page user credential validation",
  "description": "",
  "id": "validate-facebook-login;home-page-user-credential-validation;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enters Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"Kishore\" and \"Kishore\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User gets dirested  to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.User_enters_Url()"
});
formatter.result({
  "duration": 8167964800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kishore",
      "offset": 13
    },
    {
      "val": "Kishore",
      "offset": 27
    }
  ],
  "location": "StepDef.User_enters_and(String,String)"
});
formatter.result({
  "duration": 205234300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.User_clicks_login_button()"
});
formatter.result({
  "duration": 84765700,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});