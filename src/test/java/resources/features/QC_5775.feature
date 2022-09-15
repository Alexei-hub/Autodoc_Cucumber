Feature: Drop + simple product

  Background:
    Given the page opened on uri "https://www.autodoc.de/sno-pro/15080617"
    And added drop product to basket
    And the page opened on uri "https://www.autodoc.de/neolux/11767542"
    And added simple product to basket
    When go to basket
    And Login

  Scenario: Creating order with drop + simple product

    When on page "https://www.autodoc.de/basket/address" choose delivery country like shop
    And click on the next button
    When on page "https://www.autodoc.de/basket/payments" select bank as a payment method
    Then opens page "https://www.autodoc.de/basket/alldata"
    And should be visible the standard shipping
    And save the sum of the order
    When click on the SO checkbox
    And click on the buy button
    When opens the page "https://www.autodoc.de/bank/success" save the order number
    And open URL "https://aws.autodoc.de/search-orders"
    And search created order by id and open it
    Then the sum of the order should be equal to the sum from the alldata page
    And should be visible standard shipping
    And the SO should be turned on
    When Re-save order
    Then the data in order shouldn't be changed
