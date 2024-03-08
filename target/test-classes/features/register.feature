@Register
Feature: Engistrement d'un utilisateur

  Background:
    Given I am on the register page

  @Passant
  Scenario: User Register
    When I fullfilled the form with the informations below
      | email            | password   |
      | test9@yopmail.com | W3schools! |
    And I validate the register form
    And I fullfilled the form with the users information below
      | firstname | lastname |
      | testboard     | testing  |
    Then I receive an confirmation message


  @Non-passant
  Scenario Outline: User Resgiter with wrong credentials
    When I fullfilled the form with the informations below
      | email   | mot_de_passe |
      | <email> | <password>   |
    And I validate the register form
    Then I should be at the register page
    Examples:
      | email            | password |
      | bob@example.com  | 123456   |
      | carol@example    | 123456   |
      | dave@example.com | 123      |

