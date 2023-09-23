# it is our first feature file
Feature: Login functionality
 

@login
 Scenario:  Login Page Test
 
 # Gherken Language: 
 # Given, When, Then, And, But 
 
 Given user is on test environment 
 When user clicks MyAccount
 And user clicks login
 And user enters email '<sadatsayedibrahim@gmail.com>' and password '<test123>'
 And user clicks on logginButton
 Then user is navigated to the account 
 
 @test
 Scenario:  Login Page Test
 
 # Gherken Language: 
 # Given, When, Then, And, But 
 
 Given user is on test environment 
 When user clicks MyAccount
 And user clicks login
 And user enters email '<sadatsayedibrahim@gmail.com>' and password '<test123>'
 And user clicks on logginButton
 Then user is navigated to the account 