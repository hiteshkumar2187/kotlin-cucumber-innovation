Feature: the test api can be called
  Scenario: client makes a call to GET /hello
    When the client calls /hello
    Then the client receives status of 200
    And the client receives response of hello from kotlin
