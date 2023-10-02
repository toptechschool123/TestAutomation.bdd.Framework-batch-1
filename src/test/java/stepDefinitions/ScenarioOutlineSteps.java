package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

public class ScenarioOutlineSteps extends BaseClass {
	
	LoginPageObjects object = new LoginPageObjects ();
	
	
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
	    BaseClass.initializeDriver();
	    
	    logger.info("start driver");
	}

	@When("user clicks on MyAccount")
	public void user_clicks_on_my_account() {
	   object.clickMyAccount();
	   logger.info("user is clicking my Account");
	}

	@When("user click on login")
	public void user_click_on_login() {
	    object.clickLogin();
	    logger.info("user is clicking on login");
	}

	@When("user enters {string}  and {string}")
	public void user_enters_and(String email, String password) {
	    object.enterEmail(email, password);
	    System.out.println("user is entering email and password");
	    
	    logger.info("user is entering email and password" );
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	   object.clickLogginBttn();
	   
	   logger.info("user is clicking loggin buttn");
	}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
	   
	}



}
