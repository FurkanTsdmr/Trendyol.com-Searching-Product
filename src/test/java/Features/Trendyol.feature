Feature: Trendyol.com
  Scenario: Trendyol.com Searching Product
    Given User is on homepage
    When Click accept cookies
    When Click the search button
    When Write product name
    When Click search button
    When Filter for brand by LENOVO
    When Filter for highest price
    When Return the homepage
    When Select apple for the slider
