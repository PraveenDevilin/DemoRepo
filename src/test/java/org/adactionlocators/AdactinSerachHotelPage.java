package org.adactionlocators;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSerachHotelPage extends LibGlobal {

	public AdactinSerachHotelPage() {
		PageFactory.initElements(driver, this);                                    

	}

	@FindBy(id = "location")
	private WebElement txtLocation;

	@FindBy(id = "room_nos")
	private WebElement txtRooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckIn;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOut;

	@FindBy(id = "adult_room")
	private WebElement txtNoAdults;

	@FindBy(xpath = "//input[@id= 'Submit']")
	private WebElement btnSearch;

	@FindBy(id = "radiobutton_1")
	private WebElement btnRadio;

	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getTxtRooms() {
		return txtRooms;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getTxtNoAdults() {
		return txtNoAdults;
	}

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
