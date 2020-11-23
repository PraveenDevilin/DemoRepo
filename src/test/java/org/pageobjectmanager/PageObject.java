package org.pageobjectmanager;

import org.adactionlocators.AdactinBookHotelPage;
import org.adactionlocators.AdactinLoginPage;
import org.adactionlocators.AdactinSerachHotelPage;

public class PageObject {
	
	private static PageObject manager;
	private static AdactinLoginPage loginPage;
	private static AdactinSerachHotelPage serachHotelPage;
	private static AdactinBookHotelPage bookHotelPage;
	
	
	
	public static PageObject getManager() {
		return (manager==null)?  manager = new PageObject() : manager;
	}
	public  AdactinLoginPage getLoginPage() {
		return (loginPage==null)?  loginPage = new AdactinLoginPage() : loginPage;
	}
	public  AdactinSerachHotelPage getSerachHotelPage() {
		return (serachHotelPage==null)?  serachHotelPage = new AdactinSerachHotelPage() : serachHotelPage;
	}
	public  AdactinBookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?  bookHotelPage = new AdactinBookHotelPage() : bookHotelPage;
	}
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	


