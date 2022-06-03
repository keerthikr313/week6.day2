@Deletelead @lead
Feature: LeafTaps Delete Lead functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@functional @smoke
Scenario: Check for Delete Lead functionality in Leaftaps

Given Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on delete button
Then Homepage should be displayed
When click on FindLeads
Then MyHomepage should be displayed




