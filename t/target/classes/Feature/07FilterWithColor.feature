Feature:  Select Category

  Background:
    Given open browser and neivate to website

  Scenario: Logged user could filter with color
    Given user Click login button
    And user login to his account
    When user click on Categroy
    And  user click on subCategroy
    And  user choose Color
    Then Filter done succesufully