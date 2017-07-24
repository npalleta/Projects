package br.com.tests.gmail.gmailOP;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.tests.gmail.model.GmailLocator;

// Here, I am using the concept of Page Object, where every element required for the test run are built.

/*
 *  In fact, we access the three test pages. However, as this is a small test, 
 *  I created only one class providing necessary for the test run until the end.
 */

public class GmailSubmitEmailObjectPage {

	private final WebDriver driver;

	GmailLocator gmailLocator = new GmailLocator();

	public GmailSubmitEmailObjectPage(WebDriver driver) {
		this.driver = driver;
	}

	public void accessHomePage() {
		driver.get(gmailLocator.getUrl());
	}

	public void insertUser(String user) {
		driver.findElement(gmailLocator.getUsernameLocator()).sendKeys(user);
	}

	public void clickNextButton() {
		driver.findElement(gmailLocator.getNextButtonLocator()).click();
	}

	public void waitTwoSecondsPageLoad() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	public void insertPassword(String password) {
		driver.findElement(gmailLocator.getPasswordLocator()).sendKeys(password);
	}

	public void clickSignInButton() {
		driver.findElement(gmailLocator.getSignInButtonLocator()).click();
	}

	public void waitTwentySecondsPageLoad() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void clickWriteEmailButton() {
		driver.findElement(gmailLocator.getWriteEmailButtonLocator()).click();
	}

	public void insertEmailAddressInSendBox(String to) {
		driver.findElement(gmailLocator.getToLocator()).sendKeys(to);
	}

	public void insertEmailSubjectInSendBox(String subject) {
		driver.findElement(gmailLocator.getSubjectLocator()).sendKeys(subject);
	}

	public void insertEmailBodyContentInSendBox(String body) {
		driver.findElement(gmailLocator.getBodyLocator()).sendKeys(body);
	}

	public void clickEmailSubmitButton() {
		driver.findElement(gmailLocator.getEmailSubmitLocator()).click();
	}

	public void clickSendConfirmationLink() {
		driver.findElement(gmailLocator.getSendConfirmationLinkLocator()).click();
	}

	// We can isolate the assertions in another class, disassociating a little
	// and leaving our structure more organized.

	public void checkTextInTheSentEmail(String emailText) {
		String emailBodyContent = driver.findElement(gmailLocator.getEmailBodyContentLocator1()).getText();
		Assert.assertTrue("Error: Text not found! | Erro: O texto não foi encontrado!", Objects.equals(emailText, emailBodyContent));
	}

	public void searchTextInTheSentEmail() {
		List<WebElement> listEmailBodyContent = driver.findElements(gmailLocator.getEmailBodyContentLocator2());
		Assert.assertTrue("Error: Text not found! | Erro: O texto não foi encontrado!", listEmailBodyContent.size() > 0);
	}

	public void closeBrowser() {
		driver.quit();
	}
}