package br.com.tests.gmail.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

// Class responsible for setting up the webdrivers...

public class SeleniumWebDrivers {

	WebDriver webDriver;

	public WebDriver chooseWebDriver(int selector) {
		try {
			switch (selector) {
			case 1:
				webDriver = new ChromeDriver();
				break;
			case 2:
				webDriver = new FirefoxDriver();
				break;
			case 3:
				webDriver = new InternetExplorerDriver();
				break;
			default:
				webDriver = new FirefoxDriver();
				break;
			}
			//
		} catch (NullPointerException nullPointerEx) {
			nullPointerEx.printStackTrace();
			System.out.println("Error: Webdriver selector is null! | Erro: Seletor do webdriver é nulo!");
		} catch (WebDriverException WebDriverEx) {
			WebDriverEx.printStackTrace();
			System.out.println("Error: Webdriver caused an error! | Erro: O webdriver causou um erro!");
		}
		return webDriver;
	}
}
