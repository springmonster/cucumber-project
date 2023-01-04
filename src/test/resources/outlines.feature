Feature: FO1

  Scenario Outline: SO1
    Given GO1
    When input "<input>"
    Then display "<show>"
    Examples:
      | input    | show     |
      | testing  | testing  |
      | bilibili | bilibili |