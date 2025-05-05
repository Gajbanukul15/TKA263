Feature: Login functionality 

@Ignore
Scenario: validate login page with valid credential 
Given user should be open chrome browser 
When user enter username, password
And click on login button 
Then page should be navigate home page 
And close the browser 


@RunThis
Scenario Outline: validate login page with invalid credential 
Given user should be open chrome browser 
When user enter wrong username"<username>", password"<password>"
And click on login button 
Then error message should be displayed to user
And close the browser 

Examples:

     |username| password|
     |kiran@gmail.com| 123456|
     |ABC@gmail.com| 123456|
     |karan@gmail.com| 123456|