//package org.stepdef;
//
//import org.baseclass.LibGlobal;
//import org.locators.LoginPage;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDef extends LibGlobal {
//	LoginPage page;
//
//	@Given("^User enters Url$")
//	public void User_enters_Url() throws Throwable {
//		launchdriver();
//		passUrl("https://www.facebook.com/");
//
//	}
//
//	@When("^User is entering an invlaid  \"([^\"]*)\"  and an invalid  \"([^\"]*)\"$")
//	public void User_is_entering_an_invlaid_and_an_invalid(String username, String password) throws Throwable {
//		page = new LoginPage();
//		info(page.getTxtEmail(), username);
//		info(page.getTxtPass(), password);
//
//	}
//
//	@Then("^User clicks login button$")
//	public void User_clicks_login_button() throws Throwable {
//		click(page.getBtnlogin());
//
//	}
//
//}
