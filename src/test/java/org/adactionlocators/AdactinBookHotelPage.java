package org.adactionlocators;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookHotelPage extends LibGlobal {

	public AdactinBookHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtCardNo;

	@FindBy(id = "cc_type")
	private WebElement selCardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement selexpiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement selexpiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement txtCVV;

	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	@FindBy(id = "order_no")
	private WebElement txtOderNo;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getSelCardtype() {
		return selCardtype;
	}

	public WebElement getSelexpiryMonth() {
		return selexpiryMonth;
	}

	public WebElement getSelexpiryYear() {
		return selexpiryYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getTxtOderNo() {
		return txtOderNo;
	}

}
