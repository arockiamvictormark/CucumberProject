Feature: Adactin select hotel
	We can select hotel from the search options
	
	Scenario: User selects the hotel from search results
		Given list of hotel names
		When user select any one hotel
		And user click on continue button
		Then user is navigated to the book a hotel page