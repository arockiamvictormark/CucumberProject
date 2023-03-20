package step.definition;

import adactin.cucumber.Adactin_Base;
import adactin.cucumber.Pom1_LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition_login extends Adactin_Base {
	
	Pom1_LoginPage login = new Pom1_LoginPage(baseDriver);
	
	@Given("background run")
	public void background_run() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("URI.........");
		loginUrl("https://adactinhotelapp.com/");
	}
	
	@Given("hotel uri")
	public void hotel_uri() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hotel main page.........");
	}
	@When("username {string}")
	public void username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entering the username.........");
		inputValue(login.getUser(),string);
	}
	@When("password {string}")
	public void password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entering the pwd.........");
		inputValue(login.getPass(),string);
	}
	@Then("login")
	public void login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login.........");
		buttonClick(login.getLoginButton());
	}
	
	@Given("hotel search")
	public void hotel_search() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hotel search.........");
	}
	@When("select location")
	public void select_location() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("select location.........");
	}
	@Then("click search")
	public void click_search() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click search.........");
	}
	
//	@Given("username")
//	public void username() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("Enter the username.........");
//	    loginUrl("https://adactinhotelapp.com/");
//	}
//	@Given("password")
//	public void password() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Enter the password.........");
//	}
//	@When("user enters username")
//	public void user_enters_username() {
//	    // Write code here that turns the phrase above into concrete actions
//		inputValue(login.getUser(),"arockiam");
//	}
//	@When("user enters password")
//	public void user_enters_password() {
//	    // Write code here that turns the phrase above into concrete actions
//		inputValue(login.getPass(),"victor");
//	}
//	@When("user clicks login button")
//	public void user_clicks_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		buttonClick(login.getLoginButton());
//	}
//	@Then("user is navigated to search page of adactin")
//	public void user_is_navigated_to_search_page_of_adactin() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("user is navigated to search page of adactin.........");
//	}

}
