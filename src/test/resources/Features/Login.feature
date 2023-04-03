Feature: Login functionality check for Amazon E-Commerce account
Background: 
Given user in amazon homepage 
And  click the hello sign in button
Scenario: user login with valid credentials
When user enter a  username
And click the continue button
And enter a  password
And Click the sign in button
Then user successfully signed in

Scenario Outline: user login with valid and invalid credentials
When user enter a  "<username>"
And click the  continue button
And enter a  "<password>"
And Click the  sign in button
Then user not successfully signed in
Examples: 
 |username  |password |
 |9242365756|vnhjfhgjg|         
 |2688751313|sdhgvzcxa|
 |9787779060|dhfzxxxcx|
     