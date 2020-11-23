package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;

	public static WebDriver launchdriver() {

		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		return driver;
	}

	public void maxim() {
		driver.manage().window().maximize();

	}

	public void passUrl(String url) {
		driver.get(url);

	}

	public void info(WebElement element1, String msg) {
		element1.sendKeys(msg);

	}

	public void click(WebElement element1) {
		element1.click();

	}

	public void close() {
		driver.close();

	}

	public void selection(WebElement element1, String msg) {
		Select se = new Select(element1);
		se.selectByVisibleText(msg);

	}

}
