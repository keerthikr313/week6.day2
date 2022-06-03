@lead
Feature: LeafTaps Edit Lead functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@functional @smoke
Scenario: Edit Lead with mandatory information

Given Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When click on CRMSFA link
Then MyHomepage should be displayed
