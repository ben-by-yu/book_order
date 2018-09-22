$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E2E_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Selenium Test",
  "description": "",
  "id": "amazon-selenium-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Place Online Book Order",
  "description": "",
  "id": "amazon-selenium-test;place-online-book-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user searches Fifth Season",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should see search result",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 33856339790,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_searches_fifth_season()"
});
formatter.result({
  "duration": 110514862403,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_see_search_result()"
});
formatter.result({
  "duration": 118603,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Order Test",
  "description": "",
  "id": "amazon-selenium-test;order-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user click order",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should see log in page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 13735795328,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_order()"
});
formatter.result({
  "duration": 2571811477,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_see_log_in_page()"
});
formatter.result({
  "duration": 404085,
  "status": "passed"
});
});