$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E2E_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Selenium Test",
  "description": "",
  "id": "amazon-selenium-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7367568086,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Place Online Book Order",
  "description": "",
  "id": "amazon-selenium-test;place-online-book-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@AmazonSearch"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user searches American Gods",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should see search result",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonHomePageSteps.user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 43548223982,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "American Gods",
      "offset": 14
    }
  ],
  "location": "AmazonHomePageSteps.user_searches_fifth_season(String)"
});
formatter.result({
  "duration": 7702452377,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.user_should_see_search_result()"
});
formatter.result({
  "duration": 76788,
  "status": "passed"
});
formatter.after({
  "duration": 59301,
  "status": "passed"
});
formatter.before({
  "duration": 8487954031,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Order Test",
  "description": "",
  "id": "amazon-selenium-test;order-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@AmazonSearch"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user click order",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should see log in page",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonHomePageSteps.user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 24944466555,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.user_click_order()"
});
formatter.result({
  "duration": 29074425110,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.user_should_see_log_in_page()"
});
formatter.result({
  "duration": 2806931,
  "status": "passed"
});
formatter.after({
  "duration": 57401,
  "status": "passed"
});
});