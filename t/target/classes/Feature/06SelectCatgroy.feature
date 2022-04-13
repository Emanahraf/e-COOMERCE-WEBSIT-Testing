Feature:  Select Category

  Background:
    Given open browser and neivate to website

  Scenario: Logged user could select different Categories
    Given user Click login button
    And user login to his account
    When user Hover in Category
    And user choose subCategroy
    Then user go succesufully to subCategroy page