

@Regression
Feature: User login to his account
Background:
  Given open browser and neivate to website
  Scenario: User login with vaild Data

Given user Click login button
When user enter His Data: email and password
And click on Login button
Then Login completed succesufully