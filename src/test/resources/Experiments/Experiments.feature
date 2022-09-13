@domain
Feature: Bee crowd 1094 - Experiments

  Narrative:
  Know the amount of animals used in an experiment

  Scenario Outline: Calculates the sum and percentage of animals used

    Given input is <a> <b> <c> <d> <e> <f>

    When calculate sum and porcentage

    Then result should be <rabbit> <rat> <frog> <total>

    Examples:
    | a | b | c | d | e | f | rabbit | rat | frog | total |
    | 3 | 5 | 2 | 3 | 5 | 2 | 30.00 | 50.00 | 20.00 | 20  |
    | 1 | 3 | 6 | 1 | 3 | 6 | 10.00 | 30.00 | 60.00 | 20  |
    | 6 | 2 | 2 | 6 | 2 | 2 | 60.00 | 20.00 | 20.00 | 20  |