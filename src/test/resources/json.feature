Feature: F1

  Scenario: S1
    Given g1
     """json
        {
           "produce": "Gherkins",
           "weight": "1 Kilo",
           "price": "5€/Kilo"
        }
  """
    When w1
    Then t1