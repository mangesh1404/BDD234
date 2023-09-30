@JBK
Feature: JBK offline application

@login
Scenario Outline: Login test

Given User should be on login page
When  User enters valid "<username>" and "<password>"
And   User click on login button
Then  User should be on home page

Examples:
|username         |password|
|kiran@gmail.com  | 123456 |
|mangesh@gmail.com| qwerty |
|amol@ gmail.com  | asdfgh |

