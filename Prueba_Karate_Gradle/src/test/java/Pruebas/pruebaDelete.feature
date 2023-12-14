Feature: API Delete Test

  Scenario: Delete user data
    Given url 'https://reqres.in/api/users/2'
    When method DELETE
    Then status 204
    And print responseStatus