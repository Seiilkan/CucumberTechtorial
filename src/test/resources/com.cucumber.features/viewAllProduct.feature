Feature: Validation all products
@order @smoke
  Scenario:  Validation of the header
    Given the user navigate to the web orders page
    When the user provide valid username
    And the user provide valid password
    Then the user validate header text "List of All Orders"