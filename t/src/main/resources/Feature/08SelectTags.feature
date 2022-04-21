@Regression
Feature:  Select Tags
  Background:
    Given open browser and neivate to website

  Scenario:  Logged user could select different tags
    Given user Click login button
    And user login to his account
    When user click on Categroy
    And  user click on subCategroy
    And  user choose Tag
    Then Operation done succesufully