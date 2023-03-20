Feature: Adactin hotel search
	We can search hotel using multiple filters
	
	Scenario: User searches the hotel
		Given location
		When user select the location
		And hotel name
		And room type
		And number of rooms
		And check-in date
		And check-out date
		And adults per room
		And children per room
		And user click on search button
		Then user is navigated to the select hotel page