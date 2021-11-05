#@enrollment-feature

Feature: Sample component test

  Scenario:Simple verify calculation test
    Given  addition is 2
    And addition is 2
    When get operation from config
    Then actual result is 4
