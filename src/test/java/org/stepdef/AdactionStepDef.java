package org.stepdef;

import org.adactionlocators.AdactinBookHotelPage;
import org.adactionlocators.AdactinLoginPage;
import org.adactionlocators.AdactinSerachHotelPage;
import org.baseclass.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactionStepDef extends LibGlobal {

	AdactinLoginPage page;
	AdactinSerachHotelPage hotelPage;
	AdactinBookHotelPage OrderPage;

	@Given("^User enters Url$")
	public void User_enters_Url() throws Throwable {
		launchdriver();
		maxim();
		passUrl("http://adactinhotelapp.com/");
		Thread.sleep(5000);
	}

	@When("^User is entering an vlaid  \"([^\"]*)\"  and an valid  \"([^\"]*)\"$")
	public void User_is_entering_an_vlaid_and_an_valid(String user, String pass) throws Throwable {

		page = new AdactinLoginPage();
		info(page.getTxtUser(), user);
		info(page.getTxtPass(), pass);

	}

	@Then("^User clicks login button and he is directed to the search hotel page$")
	public void User_clicks_login_button_and_he_is_directed_to_the_search_hotel_page() throws Throwable {
		click(page.getBtnLogin());
	}

	@When("^User in the search hotel page enters \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void User_in_the_search_hotel_page_enters_(String location, String rooms, String checkin, String checkout,
			String adults) throws Throwable {
		hotelPage = new AdactinSerachHotelPage();
		Thread.sleep(5000);
		selection(hotelPage.getTxtLocation(), location);
		selection(hotelPage.getTxtRooms(), rooms);
		info(hotelPage.getTxtCheckIn(), checkin);
		info(hotelPage.getTxtCheckOut(), checkout);
		selection(hotelPage.getTxtNoAdults(), adults);
	}

	@Then("^User selects the continue search button and is directed to the select hotel page$")
	public void User_selects_the_continue_search_button_and_is_directed_to_the_select_hotel_page() throws Throwable {
		click(hotelPage.getBtnSearch());
	}

	@Then("^where User clicks the radio button from the options of hotels and then clicks the continue button, gets redirected to the book a hotel page$")
	public void where_User_clicks_the_radio_button_from_the_options_of_hotels_and_then_clicks_the_continue_button_gets_redirected_to_the_book_a_hotel_page()
			throws Throwable {
		click(hotelPage.getBtnRadio());
		click(hotelPage.getBtnContinue());

	}

	@When("^User in the Book a Hotel page enters the mandatory fields like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void User_in_the_Book_a_Hotel_page_enters_the_mandatory_fields_like_(String firstname, String lastname,
			String address, String cardno, String cardtype, String expirymonth, String expiryyear, String cvvno) {
		OrderPage = new AdactinBookHotelPage();
		info(OrderPage.getTxtFirstName(), firstname);
		info(OrderPage.getTxtLastName(), lastname);
		info(OrderPage.getTxtAddress(), address);
		info(OrderPage.getTxtCardNo(), cardno);
		selection(OrderPage.getSelCardtype(), cardtype);
		selection(OrderPage.getSelexpiryMonth(), expirymonth);
		selection(OrderPage.getSelexpiryYear(), expiryyear);
		info(OrderPage.getTxtCVV(), cvvno);
		click(OrderPage.getBtnBookNow());
	}

	@Then("^User clicks on the book now button is directed to the order no page and he retrieves  the order no.$")
	public void User_clicks_on_the_book_now_button_is_directed_to_the_order_no_page_and_he_retrieves_the_order_no()
			throws InterruptedException {

		Thread.sleep(5000);
		String orderNo = OrderPage.getTxtOderNo().getAttribute("value");
		System.out.println(orderNo);

	}
}
