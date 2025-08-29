Feature: Amazon Search Feature

  Scenario: Search a Product
    Given I have a search field on the Amazon
    When I search for a product with name "Apple Macbook Pro" and price 1000
    Then Product having name "Apple Macbook Pro" should be displayed