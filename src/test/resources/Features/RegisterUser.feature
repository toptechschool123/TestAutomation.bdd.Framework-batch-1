Feature: Registeration  functionality

  @Register
  Scenario: Register new customers
    Given user is on home page
    When user clicks on myaccount
    When user click register button
    And user fill out the below information
      | FirstName | LastName | Email                         | Telephone  | Password | ConfirmPassword |
      | Sayed     |  Sayed    | sayed03222ww0@toptechschool.us | 2536529199 | test123  | test123         |
    And User select 'yes' for Subscribe
    And User click privacy and policy button
    And User click Continue button
    Then user account is created with a message as follows: 'Your Account Has Been Created!'
