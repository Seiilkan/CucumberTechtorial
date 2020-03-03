Feature: Validation of Search in Etsy

  Background:
    Given the user navigate to the Etsy web page

  Scenario: Validation of Wooden spoon
    When the user search "Wooden spoon"
    Then the user validate title "Wooden spoon | Etsy"

  Scenario: Validation of MakeUp Organizer
    When the user search "Make up organizer"
    Then the user validate title "Make up organizer | Etsy"