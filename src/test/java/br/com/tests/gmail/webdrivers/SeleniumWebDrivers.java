package br.com.tests.gmail.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


// Class responsible for setting up the webdrivers...

public class SeleniumWebDrivers {

	WebDriver webDriver;

	public WebDriver chooseWebDriver(int selector) throws NullPointerException, WebDriverException {
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
			return webDriver;
			//
		} catch (NullPointerException nPEx) {
			throw new NullPointerException("Error: Webdriver selector not found! | Erro: Seletor do webdriver não encontrado!");
		} catch (WebDriverException wDEx) {
			throw new WebDriverException("Error: Webdriver caused an error! | Erro: O webdriver causou um erro!", wDEx);
		}
	}
}
