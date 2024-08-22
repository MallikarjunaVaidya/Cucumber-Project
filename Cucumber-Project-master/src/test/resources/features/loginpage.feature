Feature:Login functionality for oprncart.com e-commerce website.

 Background:
  Given as the user lands on login page

 Scenario: Successful login with valid credentials
  Given as the user enters valid email and password
  And clicks on the login button
  Then user should be able to login in successfully

 Scenario Outline: Unsuccessful login with invalid or empty credentials
  Given as the user enters invalid "<username>" and "<password>"
  And clicks on the login button
  Then User should see an error message indicating "<error_message>"

 Examples:
 |username			|password				|error_mesage
 |invalid@gmail.com	|invalid				|Warning: No match for E-Mail Address and/or Password.
 |aaabbcc			|validpass				|Warning: No match for E-Mail Address and/or Password.
 |valid@gmail.com	|acvvbss				|Warning: No match for E-Mail Address and/or Password.

 Scenario:Navigating to forgotten password page
  When user clicks on the "Forgotten Password" link
  Then user should be redirected to the password reset page
