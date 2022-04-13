Feature:  Add to Comparelist

  Background:
    Given open browser and neivate to website

  Scenario:  Logged user could add different products to Comparelist
  Given user Click login button
    And   user login to his account
    When  user click on Add to Comparelist Button
    Then  Adding Operation done succesufully