Feature: Amazon Selenium Test
	
	@AmazonSearch
	Scenario: Place Online Book Order
		Given user is on amazon home page
		When user searches American Gods
		Then user should see search result
	
	@AmazonSearch
	Scenario: Order Test
		Given user is on amazon home page
		When user click order
		Then user should see log in page
	
	@AmazonLogIn
	Scenario: Log In Amazon Account
		Given user is on amazon home page
		When user click on log in button
		And user input username and password
			|  |  |
		Then user should be logged in