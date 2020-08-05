$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Automate.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: harshita praveen"
    }
  ],
  "line": 2,
  "name": "Login functionality",
  "description": "Test the login functionality of sdet university",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Test the login functionality of sdet university",
  "description": "",
  "id": "login-functionality;test-the-login-functionality-of-sdet-university",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user navigates to the desired webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on bestsellers",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the Bestsellers items should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the required item",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "clicks on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the item will be displayed in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Automationsteps.user_navigates_to_the_desired_webpage()"
});
formatter.result({
  "duration": 10126915400,
  "status": "passed"
});
formatter.match({
  "location": "Automationsteps.user_clicks_on_bestsellers()"
});
formatter.result({
  "duration": 6709318200,
  "status": "passed"
});
formatter.match({
  "location": "Automationsteps.the_Bestsellers_items_should_be_displayed()"
});
formatter.result({
  "duration": 83794900,
  "status": "passed"
});
formatter.match({
  "location": "Automationsteps.user_clicks_on_the_required_item()"
});
formatter.result({
  "duration": 5436875400,
  "status": "passed"
});
formatter.match({
  "location": "Automationsteps.clicks_on_add_to_cart()"
});
formatter.result({
  "duration": 6603745900,
  "status": "passed"
});
formatter.match({
  "location": "Automationsteps.the_item_will_be_displayed_in_the_cart()"
});
formatter.result({
  "duration": 4347293300,
  "status": "passed"
});
});