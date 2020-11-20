package org.adactionlocators;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage extends LibGlobal {

	public AdactinLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUser;

	@FindBy(id = "password")
	private WebElement txtPass;

	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(id = "location")
	private WebElement TxtLocation;

	@FindBy(id = "room_nos")
	private WebElement txtRooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckIn;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOut;

	@FindBy(id = "adult_room")
	private WebElement txtNoAdults;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}


}
