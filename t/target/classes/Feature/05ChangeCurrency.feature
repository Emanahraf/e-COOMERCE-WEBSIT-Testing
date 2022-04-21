@Regression
Feature:  Change Currency
  Background:
    Given open browser and neivate to website

  Scenario: Logged User could switch between currencies US-Euro
    Given user Click login button
    And user login to his account
    When user Click in currency list
    And user choose from currency list
    Then currency change succesufully