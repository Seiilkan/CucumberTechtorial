Feature: This is for WebOrder all products
@smoke
  Scenario:  Validation of all product data
    Given the user navigate to the web orders page
    When the user provide valid username
    And the user provide valid password
    Then the user click view all products button
    And the user validate product table
