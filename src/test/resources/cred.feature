Feature: Validate Adactin Login

  Scenario: Home page user credential validation with valid username and password
    Given User enters Url
    When User is entering an valid  "Lucifer797"  and an valid  "DanTe2007!"
    Then User clicks login button
