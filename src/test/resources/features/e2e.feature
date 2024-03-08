
@Register
Feature: Engistrement d'un utilisateur

  Scenario: :
    Given I am on the register page
    When I fullfilled the form with the users information below
    And I login as "" ""
    And I enter "" in the search bar
    And I should see a list of tutorials about ""
    And I logout
    Then I am on the login page
