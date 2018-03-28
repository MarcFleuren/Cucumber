Feature: Working with my Calculator
  As a person
  I want to manipulate numbers
  So that I can demonstrate it gives the correct result

Scenario: Add two numbers
  Given I have a calculator
  When I add two integers 3 and 4
  Then I should get 7

Scenario: Multiply two numbers
  Given I have a calculator
  When I multiply two integers 5 and 3
  Then I should get 15


