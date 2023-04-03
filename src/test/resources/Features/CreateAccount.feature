
Feature:  Registration for amazon account
  Scenario: user account registration for amazon
    Given user in amazon home page 
    And   click the hello signin button
    And   user click the create amazon account button
    When  user  enters a username
    And   enters a phone number
    And   enters a password
    And   clicks the continue button
    Then  Authentication is required