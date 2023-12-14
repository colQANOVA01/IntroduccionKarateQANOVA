Feature: API Put Test

  Scenario: Put user data
    Given url 'https://reqres.in/api/users/2'
    And request {"name": "steve", "job": "Store Manager"}
    When method PUT
    Then status 200
    And print response