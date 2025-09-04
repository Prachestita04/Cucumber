Feature: Grocery items adding to cart

  Background:
    Given User has a valid login credentials of Jiomart
    And User has an active jio number

  Scenario: Adding fruits to cart
    When User adds fruits to the cart
      | seasonal | mango       | alphonso       | big   |
      | exotic   | dragon fruit | red            | small |
      | organic  | grapes      | green seedless | big   |
    And User provides the quantity of each item
    Then User is redirected to payment page

  Scenario: Adding milks and bakery products to cart
    When User adds milks and bakery products to the cart
      | milk  | toned | 500ml | 5-sept  |
      | bread | white | big   | 10-sept |
    And User provides the quantity of each item
    Then User is redirected to payment page

  Scenario: Adding electronics products to cart
    When User adds electronics products to the cart
      | tv     | sony    |
      | mobile | samsung |
    And User provides the quantity of each item
    Then User is redirected to payment page
