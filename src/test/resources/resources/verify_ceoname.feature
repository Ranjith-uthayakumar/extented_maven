@GetCEOName
Feature: This feature is to get the CEO name from the OrangeHRM app
Scenario Outline: this test is to verify the CEO name
Given the user is logged in successfully and is on Home page
When the user clicks on the directory option from the Menu ba
And the user selects the job title as "CEO" from the dropdown
And clicks the search button
Then the user should see the CEO name as "<CEO_Name>"
