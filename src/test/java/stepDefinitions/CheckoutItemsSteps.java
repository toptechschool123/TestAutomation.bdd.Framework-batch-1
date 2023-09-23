
package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutItemsPageObject;

public class CheckoutItemsSteps extends BaseClass {
	
	CheckOutItemsPageObject object =new CheckOutItemsPageObject();
	

@Given("user is in homepage")
public void user_is_in_homepage() {
    BaseClass.initializeDriver();
}

@When("user is clicking myAccount")
public void user_is_clicking_my_account() {
   object.clickMyAccount();
}

@When("user is clicking Login")
public void user_is_clicking_login() {
    object.clickLogin();
}

@When("user is entering email {string}")
public void user_is_entering_email(String email) {
    object.enterEmail(email);
}

@When("user is entering password {string}")
public void user_is_entering_password(String password) {
    object.enterPassword(password);
}

@When("user is clicking loginButton")
public void user_is_clicking_login_button() {
    object.clickLoginBttn();
}

@Then("user move to Cameras")
public void user_move_to_cameras() throws InterruptedException {
    object.moveToCameras();
}

@Then("user user moves to SonyItem and clicks it")
public void user_user_moves_to_sony_item_and_clicks_it() throws InterruptedException {
    object.moveToSonyItem();
}

@Then("user adds an item to cart")
public void user_adds_an_item_to_cart() {
   object.addItemToCart();
}

@Then("user clicks items MyAccount at the bottom of the page")
public void user_clicks_items_my_account_at_the_bottom_of_the_page() {
   object.clickMyAccount2();
}

@Then("user logs out")
public void user_logs_out() {
  object.clickLogoutBttn();
}
}