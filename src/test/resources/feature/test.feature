Feature: Guess the word

  # The first example has two steps
  Scenario: Maker starts a game
    Given you are in Given annotation
    When you are in When annotation
    Then you are in Then "variable11"
    And you are in And annotation
    But you are in But annotation
    
    # The first example has two steps
  Scenario Outline: Maker starts a game2
    Given you are in Given annotation1
    When you are in When annotation1
    Then data parameterization "<username>"
    And you are in And annotation1
    But you are in But annotation1
    
    Examples:
    |username|
    |rohitkant|
   