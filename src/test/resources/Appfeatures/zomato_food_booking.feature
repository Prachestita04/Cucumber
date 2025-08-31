Feature: Zomato Food Booking Feature
  In order to order food
  as a registered user
  You have to select foods,quantity of foods and buy those foods

  Background:
    Given User must have registered one
    Given User in Zomato login page
    When User enters username
    And enters password
    Then User navigate to Zomato Home page

  Scenario: Food Selecting
    When User select "Biriyani"
    Then User able to select this food from a "resturant" with quantity

  Scenario: Food Ordering
    When User select food and do "add to cart"
    Then User able to see food in "add to cart" option
    And order food

  Scenario: Cancel Order
    When User goes to "Your Order" page and click Cancel Order link
    Then Food order is cancelled
    And User fee will return within few hours