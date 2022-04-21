@Regression
Feature: user could reset password
  Background:
    Given open browser and neivate to website

  Scenario: reset password Happy scenario
    Given user Click login button
    And user click Reset password
    When user enter His email
    And click on reset button
    Then reset completed succesufully