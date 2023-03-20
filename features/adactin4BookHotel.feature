Feature: Adactin book hotel
	We can book hotel by entering our personal deatils and payment options
	
	Scenario: User books hotel by entering personal details
		Given firstname
		And lastname
		And billing address
		And credit card number
		And credit card type
		And expiry date
		And CVV number
		When user enter firstname
		And billing address
		And credit card number
		And credit card type
		And expiry date
		And CVV number
		And user click on book now button
		Then user is navigated to booking confirmation page