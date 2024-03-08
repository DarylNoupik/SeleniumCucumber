@Search
Feature: : Searching for exercises/tutorials with specific criteria

  Scenario Outline: Searching for a specific exercise/tutorial
    Given I am on the login page
    And I login as "daryl@yopmail.com" "W3schools!"
    When I enter "<search_term>" in the search bar
    Then I should see a list of tutorials about "<search_term>"
    Examples:
      | search_term |
      | Java        |

