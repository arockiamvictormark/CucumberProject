package step.definition;

import adactin.cucumber.Adactin_Base;
import adactin.cucumber.Pom1_LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition_search extends Adactin_Base {
	
	Pom1_LoginPage login = new Pom1_LoginPage(baseDriver);
	
	@Given("location")
	public void location() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given the location.........");
	}
	@When("user select the location")
	public void user_select_the_location() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Select the location.........");
		selectOption(login.getLocation(), 2);
	}
	@When("hotel name")
	public void hotel_name() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("room type")
	public void room_type() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("number of rooms")
	public void number_of_rooms() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("check-in date")
	public void check_in_date() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("check-out date")
	public void check_out_date() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("adults per room")
	public void adults_per_room() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("children per room")
	public void children_per_room() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("user click on search button")
	public void user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click the search button.........");
		buttonClick(login.getSearchButton());
	}
	@Then("user is navigated to the select hotel page")
	public void user_is_navigated_to_the_select_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User navigated to hotel page.........");
	}

}
