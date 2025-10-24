Feature: Calculate billing amount

  Scenario Outline: Billing amount
    Given User is on billing page
    When user enters billing amount "<billing amount>"
    And user enters tax amount "<tax amount>"
    And user clicks on calculate button
    Then it gives final amount "<final amount>"
    Examples:
    |billing amount|tax amount| final amount|
    |1000          |10        |1010         |
    |2000          |1         |2002         |
    |1000          |5.5       |1005.5       |
