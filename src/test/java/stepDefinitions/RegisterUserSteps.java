package stepDefinitions;

import java.util.List;
import java.util.Map;



import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterUserPageObjects;

public class RegisterUserSteps {
	RegisterUserPageObjects object = new RegisterUserPageObjects();
	
@Given("user is on home page")
public void user_is_on_home_page() {
	BaseClass.initializeDriver();
}

@When("user clicks on myaccount")
public void user_clicks_on_myaccount() throws InterruptedException {
	object.clickOnMyAccount();
}

@When("user click register button")
public void user_click_register_button() throws InterruptedException {
	object.clickRegister();
}

@When("user fill out the below information")
public void user_fill_out_the_below_information(io.cucumber.datatable.DataTable info) {
    
	List<Map<String, String >>	data=info.asMaps(String.class, String.class);

	object.enterFirstName(data.get(0).get("FirstName"));
	object.enteLastName(data.get(0).get("LastName"));	
	object.enterEmail(data.get(0).get("Email"));	
	object.enterTelephone(data.get(0).get("Telephone"));
	object.enterPassword(data.get(0).get("Password"));
	object.enterConfPassword(data.get(0).get("ConfirmPassword"));
		
	object.selectCountry();
	
	/*
	object.enterFirstName(data.get(0).get("FirstName"));
	object.enteLastName(data.get(0).get("LastName"));
	object.enterEmail(data.get(0).get("Email"));
	object.enterTelephone(data.get(0).get("Telephone"));
	object.selectCountry();
	object.enterPassword(data.get(0).get("Password"));
	object.enterConfPassword(data.get(0).get("ConfirmPassword"));
		*/
}

@When("User select {string} for Subscribe")
public void user_select_for_subscribe(String yes) {
   object.clickSubscribe();
}

@When("User click privacy and policy button")
public void user_click_privacy_and_policy_button() {
   object.clickPrivacyPolicy();
}

@When("User click Continue button")
public void user_click_continue_button() {
    object.clickContinueBttn();
}

@Then("user account is created with a message as follows: {string}")
public void user_account_is_created_with_a_message_as_follows(String message) throws InterruptedException {
   
	object.accountCreated();
}



}
