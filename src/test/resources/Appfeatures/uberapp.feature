Feature: Uber booking feature

  Scenario: Booking cab
    Given User wants to select a car of type "Sedan"
    When User selects car type as "Sedan" and pick up point as "Banglore" and drop point as "Pune"
    Then Driver starts journey
    And Driver ends journey
    Then User pays Rs. 1000