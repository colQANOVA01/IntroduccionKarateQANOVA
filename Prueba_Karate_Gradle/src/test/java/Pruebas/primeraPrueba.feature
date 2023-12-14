Feature: First API Test # Esta prueba consiste en realizar un metodo get

  Scenario: Run a Get API Test
    Given url 'https://reqres.in/api/users?page=2'
    When method GET
    Then status 200
