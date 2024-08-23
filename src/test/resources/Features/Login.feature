Feature: Login

Scenario: Validate the login using correct username and password
Given I am on the login page
When I enter correct username and password
And I click on Login button
Then I should be logged in

Scenario: Validate the login using incorrect username and password
Given I am on the login page
When I enter incorrect username and password
And I click on Login button
Then I should see an error message

Scenario: Validate that forgot password sends an email.
Given I am on the login page
And I click on Forgot Password Link
And I enter Usernames for the reset link to be sent to
When I click on Reset Password button
Then A reset password link should be sent
