Feature: API Post Test

  Scenario: Post user data
    Given url 'https://reqres.in' + '/api/users'
    And request {'name': 'manuel', 'job': 'chef'}
    When method POST
    Then status 201
