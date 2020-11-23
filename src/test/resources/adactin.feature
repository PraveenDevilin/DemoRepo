Feature: Validate Adaction page and getting Order no.

	@SmokeTest
  Scenario Outline: Home page user credential validation with valid usernames and passwords
    Given User enters Url
    When User is entering an vlaid  "<username>"  and an valid  "<password>"
    Then User clicks login button and he is directed to the search hotel page
    When User in the search hotel page enters "<location>" , "<number of rooms>", "<CheckinDate>","<CheckoutDate>","<Adults per Room>"
    Then User selects the continue search button and is directed to the select hotel page
    Then where User clicks the radio button from the options of hotels and then clicks the continue button, gets redirected to the book a hotel page
    When User in the Book a Hotel page enters the mandatory fields like "<first name>","<last name>","<billing address>""<credit card no>","<credit card type>","<expiry month>","<expiry year>","<cvv no>"
    Then User clicks on the book now button is directed to the order no page and he retrieves  the order no.

    Examples: 
      | username   | password   | location  | number of rooms | CheckinDate | CheckoutDate | Adults per Room | first name   | last name | billing address                         | credit card no   | credit card type | expiry month | expiry year | cvv no |
      | Lucifer797 | DanTe2007! | Sydney    | 2 - Two         | 19/11/2020  | 21/11/2020   | 4 - Four        | Praveenkumar | jothi     | no.139 aravindhar street, pondicheery-1 | 1234567891234567 | VISA             | July         |        2021 |    123 |
      | Lucifer797 | DanTe2007! | Melbourne | 2 - Two         | 18/11/2020  | 21/11/2020   | 4 - Four        | Bala         | jothi     | no.139 aravindhar street, pondicheery-1 | 1234567891234567 | Master Card      | June         |        2021 |    456 |
      | Lucifer797 | DanTe2007! | Brisbane  | 2 - Two         | 11/11/2020  | 21/11/2020   | 4 - Four        | Sreedharan   | jothi     | no.139 aravindhar street, pondicheery-1 | 1234567891234567 | American Express | August       |        2022 |    789 |
      | Lucifer797 | DanTe2007! | London    | 2 - Two         | 11/11/2020  | 2/12/2020    | 4 - Four        | kishore      | vaideki   | no.139 aravindhar street, pondicheery-1 | 1234567891234567 | American Express | February     |        2022 |    912 |
      | Lucifer797 | DanTe2007! | New York  | 2 - Two         | 12/12/2020  | 14/11/2020   | 4 - Four        | ram          | kumar     | no.139 aravindhar street, pondicheery-1 | 1234567891234567 | Master Card      | February     |        2022 |    345 |
