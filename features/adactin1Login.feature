Feature: Adactin user login page
	User needs to check login functionality
	
	
	Background: 
		Given background run
		
	@loginpage
	Scenario: User enters username and password
		Given hotel uri
		When username "<UserName>"
		And password "<PassWord>"
		Then login
		
	Examples: 
		|UserName|PassWord|
#		|arockiam|victoor|
		|arockiam|victor|
		
	@searchpage
	Scenario: User searches the hotel
		Given hotel search
		When select location
		Then click search
	
	Scenario: User enters username and password to login the page
		Given username
		And password
		When user enters username
		And user enters password
		And user clicks login button
		Then user is navigated to search page of adactin