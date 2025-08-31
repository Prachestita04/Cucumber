Feature: Buying Flat Features

  @Smoke
  Scenario: 1BHk Flat Booking
    Given User wants to choose "1BHK" flat in "Landmark" apartment
    When User select from one of them
    Then User pays amount of Rs. 50000

  @Regression
  Scenario: 2BHk Flat Booking
    Given User wants to choose "2BHK" flat in "Landmark" apartment
    When User select from one of them
    Then User pays amount of Rs. 100000

  @Sanity
  Scenario: 3BHk Flat Booking
    Given User wants to choose "3BHK" flat in "Landmark" apartment
    When User select from one of them
    Then User pays amount of Rs. 2000000