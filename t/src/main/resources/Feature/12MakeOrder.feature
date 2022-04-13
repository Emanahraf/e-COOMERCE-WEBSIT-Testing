Feature:  Make order

  Background:
    Given open browser and neivate to website

  Scenario: Create successful Order
  Given user Click login button
    And  user login to his account
    When  user click on Add to Cart
    And User open his Cart
    And user Accept Terms
    And user click check out
    And User enter His Data
    And user Choose payement method,Shipping and confirm order
    Then  order created succesufully

