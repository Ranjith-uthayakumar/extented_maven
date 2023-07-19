@timesheets
Feature: This feature is to get the pending timesheet
Scenario Outline: this test is to verify the pending timesheet
Given the user is on Home page
When the user clicks on the time option from the Menu ba
And the user enters the name as "John smith"
And clicks the view button
Then the user should see the message as "<Message>"
