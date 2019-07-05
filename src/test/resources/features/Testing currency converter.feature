Feature: Testing the currency converter

  Scenario Outline: As a user I want to test the currency converter function
    Given User goes to the currency converter url
    Then Enter the amount for conversion <Amount>
    And Select the from currency <From currency>
    And Select the to currency <To currency>
    Then Click on submit
    And Asserting the conversion <From currency> <To currency>

  Examples:
  |Amount |From currency | To currency |
  | 10    |EUR           | USD         |
  | 20    |INR           | SGD         |
  | 7     |CAD           | BBD         |
  | 3     |AUD           | AED         |
  | 15    |GBP           | CHF         |
