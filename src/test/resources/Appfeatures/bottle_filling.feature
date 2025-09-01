Feature: Bottle filling feature

  Background:
    Given User must have a "bottle" to fill water

  @Smoke @Start
  Scenario: Filling bottle
    When User press bottle filling option
    Then "Filling" process should be started

  @Sanity @Stop
  Scenario: Stop filling process
    When After filling when user press "bottle filling" option
    Then water flow should be stopped
