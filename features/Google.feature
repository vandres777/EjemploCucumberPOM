Feature: Test Google search functionality

  Scenario: As a user I enter a search criteria  in Google
    Given I am on the Google search page
    When I enter a search criteria
    And Click on the search button
    Then The results match the criteria
