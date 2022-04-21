@Regression
Feature:  search product
  Background:
    Given open browser and neivate to website

  Scenario: Logged User could search for any product
    Given user Click login button
    And user login to his account
    When user enter search key
    Then user Get success search Result