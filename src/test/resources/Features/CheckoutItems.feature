Feature: Items checkout functionality

@checkout
  Scenario: Test ItemsCheckout
    Given user is in homepage
    When user is clicking myAccount
    And user is clicking Login
    And user is entering email 'sadatsayedibrahim@gmail.com'
    And user is entering password 'test123'
    And user is clicking loginButton
    Then user move to Cameras
    And user user moves to SonyItem and clicks it
    Then user adds an item to cart
    And user clicks items MyAccount at the bottom of the page
    Then user logs out
