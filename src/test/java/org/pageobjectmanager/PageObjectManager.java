package org.pageobjectmanager;

import org.adactionlocators.AdactinBookHotelPage;
import org.adactionlocators.AdactinLoginPage;
import org.adactionlocators.AdactinSerachHotelPage;

public class PageObjectManager {
	static PageObjectManager manager = new PageObjectManager();
	static AdactinLoginPage loginPage = new AdactinLoginPage();
	static AdactinSerachHotelPage serachHotelPage = new AdactinSerachHotelPage();
	static AdactinBookHotelPage bookHotelPage = new AdactinBookHotelPage();

	public PageObjectManager() {

	}

	public static   PageObjectManager getManager() {
		return manager;
	}

	public  AdactinLoginPage getLoginPage() {
		return loginPage;
	}

	public   AdactinSerachHotelPage getSerachHotelPage() {
		return serachHotelPage;
	}

	public  AdactinBookHotelPage getBookHotelPage() {
		return bookHotelPage;
	}

}
