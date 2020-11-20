Feature: Validate Facebook Login

  Scenario Outline: Home page user credential validation with invalid username and password
    Given User enters Url
    When User is entering an invlaid  "<username>"  and an invalid  "<password>"
    Then User clicks login button

    Examples: 
      | username | password |
      | Praveen  | Praveen  |
      | Bala     | Bala     |
      | Kishore  | Kishore  |
      | Ram      | RAM      |
