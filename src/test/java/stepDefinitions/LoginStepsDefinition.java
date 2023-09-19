package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

public class LoginStepsDefinition extends BaseClass{
	LoginPageObjects object = new LoginPageObjects();
	
	
	@Given("user is on test environment")
	public void user_is_on_test_environment() {
	  BaseClass.initializeDriver();
	}

	@When("user clicks MyAccount")
	public void user_clicks_my_account() {
		object.clickMyAccount();
	}

	@When("user clicks login")
	public void user_clicks_login() {
		object.clickLogin();
	}

	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password) {
		object.enterEmail(email, password);
	}

	@When("user clicks on logginButton")
	public void user_clicks_on_loggin_button() {
		object.clickLogginBttn();
	}

	@Then("user is navigated to the account")
	public void user_is_navigated_to_the_account() {
	   
	}



}
