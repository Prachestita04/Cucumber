Feature: Restaurant Table Booking Hooks Feature

  Scenario: Booking table for 2 peoples
    Given User must have to go to restaurant site for booking
    And successfully register and login in site
    When User select table for "two" peoples
    Then "Manager" allocate that table to user
    And Mentioned "Reserved" in table

  Scenario: Booking table for 3 peoples
    Given User must have to go to restaurant site for booking
    And successfully register and login in site
    When User select table for "three" peoples
    Then "Manager" allocate that table to user
    And Mentioned "Reserved" in table
