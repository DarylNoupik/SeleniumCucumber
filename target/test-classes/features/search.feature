Feature: : Searching for exercises/tutorials with specific criteria

  Scenario Outline: Searching for a specific exercise/tutorial
    Given I am on the W3Schools homepage
    When I enter <search_term> in the search bar
    And I click the "Search" button
    Then I should see a list of exercises/tutorials about <search_term>
    Examples:
      | search_term |
      | Java        |
      | HTML        |
      | CSS         |
