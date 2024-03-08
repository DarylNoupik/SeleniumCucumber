@logout
Feature: Deconnexion Utilisateur
  En tant qu'utilisateur connecte je veux pouvoir me deconnecter de la
  la plateforme en toute securite afin de proteger mes informations
  personnelles

  Scenario: Deconnexion
    Given I am on the login page
    And I login as "daryl@yopmail.com" "W3schools!"
    When I logout
    Then I am on the login page
