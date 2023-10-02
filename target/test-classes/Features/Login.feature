# it is our first feature file
Feature: Login functionality

  Scenario: Login Page Test
    # Gherken Language:
    # Given, When, Then, And, But
    Given user is on test environment
    When user clicks MyAccount
    And user clicks login
    And user enters email '<sadatsayedibrahim@gmail.com>' and password '<test123>'
    And user clicks on logginButton
    Then user is navigated to the account

 @test
  Scenario Outline: I want to login to my Account
    Given the user is on the homepage
    When user clicks on MyAccount
    And user click on login
    And user enters '<email>'  and '<password>'
    And user clicks login button
    Then user is navigated to the login page

    Examples: 
      | email                       | password   |
      | sadatsayedibrahim@gmail.com | test123    |
      | Jamz.bluesky@gmail.com      | Amira@143$ |
