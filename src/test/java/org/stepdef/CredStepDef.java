//package org.stepdef;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CredStepDef {
//	static WebDriver driver;
//
//	@Given("^User enters Url$")
//	public void User_enters_Url() throws Throwable {
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://adactinhotelapp.com/");
//		String title = driver.getTitle();
//		System.out.println(title);
//
//	}
//
//	@When("^User is entering an valid  \"([^\"]*)\"  and an valid  \"([^\"]*)\"$")
//	public void User_is_entering_an_valid_username_and_an_valid_password(String a, String b) throws Throwable {
//		
//		driver.findElement(By.id("username")).sendKeys(a);
//		driver.findElement(By.id("password")).sendKeys(b);
//
//	}
//
//	@Then("^User clicks login button$")
//	public void User_clicks_login_button() throws Throwable {
//		driver.findElement(By.name("login")).click();
//	}
//
//}
