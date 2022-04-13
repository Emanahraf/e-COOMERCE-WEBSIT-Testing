Feature:  Add to Wishlist

  Background:
    Given open browser and neivate to website

  Scenario:  Logged user could add different products to Wishlist
  Given user Click login button
   And   user login to his account
    When  user click on Add to Wishlist Button
    Then  Adding Operation done succesufully