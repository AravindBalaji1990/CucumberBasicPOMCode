$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureDemoFacebook.feature");
formatter.feature({
  "line": 1,
  "name": "facebook login page",
  "description": "",
  "id": "facebook-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10678801372,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "facebook-login-page;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I enter the url for the applciation",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter the login details",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I verify the invalid message page details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFacebookPage.i_enter_the_url_for_the_applciation()"
});
formatter.result({
  "duration": 3360288976,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionFacebookPage.I_enter_the_login_details()"
});
formatter.result({
  "duration": 4006320649,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionFacebookPage.i_verify_the_page_details()"
});
formatter.result({
  "duration": 165221233,
  "status": "passed"
});
formatter.after({
  "duration": 1448930038,
  "status": "passed"
});
});