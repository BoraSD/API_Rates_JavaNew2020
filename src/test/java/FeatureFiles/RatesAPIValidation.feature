Feature: Validate Rates API

  @test1
  Scenario: Verify GET success response for latest exchange rates
    Given Rates API for latest foreign exchange
    When I give GET call to the Rates API
    Then Verify API call is success with status code "200"

  @test2
  Scenario: Verify the response for GET call for latest exchange rates
    Given Rates API for latest foreign exchange
    When I give GET call to the Rates API
    Then Verify response for "base" is "EUR"

  @test3
  Scenario: Verify GET response for incorrect URL for latest exchange rates
    Given Incorrect Rates API URL for latest foreign exchange
    When I give GET call to the Rates API
    Then Verify API call is incorrect with status code "400"