package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BasePage {
	//This the WebDrive instance
	private WebDriver driver = null;
	
	//Getter method for the webDriver
	public WebDriver getDriver() {
		return this.driver;
	}

	/*
	 * This method will always be executed before every test method.
	 * The browser will be launched for each test. 
	 */
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		// Runs on Chrome.
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
	}

	/*
	 * This method will always be executed after every test method.
	 * The browser will be closed after each test. 
	 */
	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.quit();
	}

}