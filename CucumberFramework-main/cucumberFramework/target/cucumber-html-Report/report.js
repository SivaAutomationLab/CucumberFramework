$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the OrangeFRM page",
  "description": "",
  "id": "login-to-the-orangefrm-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2431554458,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login to the OrangeFRM page",
  "description": "",
  "id": "login-to-the-orangefrm-page;login-to-the-orangefrm-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.user_launch_the_webpage()"
});
formatter.result({
  "duration": 6802781666,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.user_closes_the_browser()"
});
formatter.result({
  "duration": 43709,
  "status": "passed"
});
formatter.after({
  "duration": 412278917,
  "status": "passed"
});
});