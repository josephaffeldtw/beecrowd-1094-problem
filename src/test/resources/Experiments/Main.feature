@system
Feature: Bee crowd 1094

  Narrative:
  Know the amount of animals used in an experiment

  Scenario: Experiments number is valid
    Given input is
    """
    10
    10 C
    6 R
    15 S
    5 C
    14 R
    9 C
    6 R
    8 S
    5 C
    14 R
    """

    When program run

    Then output should be
    """
    Total: 92 cobaias
    Total de coelhos: 29
    Total de ratos: 40
    Total de sapos: 23
    Percentual de coelhos: %2.f %31.52173913043478
    Percentual de ratos: 43.47826086956522 %
    Percentual de sapos: 25.0 %
    """

  Scenario: Experiments number is invalid (positive)
    Given input is
    """
    18
    10 C
    6 R
    15 S
    5 C
    14 R
    9 C
    6 R
    8 S
    5 C
    14 R
    """

    When program run

    Then output should be
    """
    quantidade de testes não permitida 18
    """

  Scenario: Experiments number is invalid (negative)
    Given input is
    """
    -1
    10 C
    6 R
    15 S
    5 C
    14 R
    9 C
    6 R
    8 S
    5 C
    14 R
    """

    When program run

    Then output should be
    """
    quantidade de testes não permitida -1
    """
