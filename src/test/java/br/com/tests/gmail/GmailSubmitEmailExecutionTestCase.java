package br.com.tests.gmail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import br.com.tests.gmail.gmailOP.GmailSubmitEmailObjectPage;
import br.com.tests.gmail.webdrivers.SeleniumWebDrivers;

// Our Test Case...
public class GmailSubmitEmailExecutionTestCase {
	
	// Requirements for playing the Test Case... 
	
	// Web Driver
	private SeleniumWebDrivers seleniumWebDrivers;
	
	// Object Page
	private GmailSubmitEmailObjectPage gmailSubmitEmail;

	// User Email
	private String user = "testuser@test.com";
	// Password Email
	private String password = "testpassword123";
	// Email Receiver
	private String to = "receiver@test.com";
	// Subject of The Email
	private String subject = "Teste Teste";
	// Body Email
	private String body = "Teste Teste Teste Teste Teste Teste Teste Teste Teste...";

	@Before()
	public void setUp() {
		seleniumWebDrivers = new SeleniumWebDrivers();
		/* ...passing the method chooseWebDriver() as parameter... 
		 * And this method has an integer parameter in which it is responsible for the choice the webdriver.
		 */
		gmailSubmitEmail = new GmailSubmitEmailObjectPage(seleniumWebDrivers.chooseWebDriver(3));
	}

	// Steps to reproduce the functionality to be tested...
	@Test
	public void testGmailEmailSending() {
		gmailSubmitEmail.accessHomePage();
		gmailSubmitEmail.insertUser(user);
		gmailSubmitEmail.clickNextButton();
		gmailSubmitEmail.waitTwoSecondsPageLoad();
		gmailSubmitEmail.insertPassword(password);
		gmailSubmitEmail.clickSignInButton();
		gmailSubmitEmail.waitTwentySecondsPageLoad();
		gmailSubmitEmail.clickWriteEmailButton();
		gmailSubmitEmail.waitTwoSecondsPageLoad();
		gmailSubmitEmail.insertEmailAddressInSendBox(to);
		gmailSubmitEmail.insertEmailSubjectInSendBox(subject);
		gmailSubmitEmail.insertEmailBodyContentInSendBox(body);
		gmailSubmitEmail.clickEmailSubmitButton();
		gmailSubmitEmail.waitTwoSecondsPageLoad();
		gmailSubmitEmail.clickSendConfirmationLink();
		gmailSubmitEmail.checkTextInTheSentEmail(body);
		gmailSubmitEmail.searchTextInTheSentEmail();
	}

	// Close the browser window after the test.
	@After
	public void tearDown() {
		gmailSubmitEmail.closeBrowser();
	}
}
