Feature: Visiting Temple Feature

  Background:
    Given User must be in "Hindu" religion
    And User should have taken bath

  @General
  Scenario: Temple visit to perform Puja
    When User visits temple
    Then User performs puja in temple

  @Vip
  Scenario: Temple visit to perform Puja
    When User visits temple and show his id
    Then User able to go in a VIP line and performs puja