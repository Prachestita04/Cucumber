Feature: Watching movie features
  Scenario: Watch movie in Netflix
    Given User must be a registered one in Netflix app
    And User has a subscription
    When User opens one movie and click watch option
    Then User can see that movie