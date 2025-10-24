Feature: Flight Booking features

  Scenario: Onetrip flight book
    Given User wants to select "Onetrip" option from list
    When User selects this and gives from as "Mumbai" to as "Bbsr"
    Then All the flights from this location will be shown
    And User select one of them
    Then User have to pay Rs. 6000

  Scenario: Roundtrip flight book
    Given User wants to select "Roundtrip" option from list
    When User selects this and gives from as "Bangalore" to as "Dehradun"
    Then All the flights from this location will be shown
    And User select one of them
    Then User have to pay Rs. 10000

  Scenario: Multiwaytrip flight book
    Given User wants to select "Multicity" option from list
    When User selects this and gives from as "Aehmdabad" to as "Mumbai" and add one more flight to destination as "Heyderabad"
    Then All the flights from these two locations will be shown
    And User select one of them and connecting flight also
    Then User have to pay total amout of Rs. 15000