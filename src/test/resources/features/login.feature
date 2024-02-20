@login
Feature: Fonctionnalite de connexion

  Background:
    Given I am on the login page

  @Passant
  Scenario: Login cas passant
    When I login as "daryl@yopmail.com" "W3schools!"
    Then I should be at the home page

  @Non-passant
  Scenario: Login cas non passant
    When I login as "cindy" "1234657"
    Then I should be at the login page


