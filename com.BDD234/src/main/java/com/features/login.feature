Feature: JBK offline application


Scenario: Login test

Given User should be on login page
When  User enters valid username
And   User enters valid password
And   User click on login button
Then  User should be on home page

