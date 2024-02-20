@logout
Feature: Deconnexion Utilisateur
  En tant qu'utilisateur connecte je veux pouvoir me deconnecter de la
  la plateforme en toute securite afin de proteger mes informations
  personnelles

  Scenario: Deconnexion
    Given je suis connecte avec mon compte
    When  je me deconnecte de mon compte
    Then je suis redirige sur la page d'acceuil
    And mes informations personnelles ne sont plus accessibles