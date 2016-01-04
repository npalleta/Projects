package br.com.tests.gmail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import br.com.tests.gmail.gmailOP.GmailSubmitEmailObjectPage;
import br.com.tests.gmail.webdrivers.SeleniumWebDrivers;

// Our Test Case...
public class GmailSubmitEmailExecutionTestCase {

	
	// Requirements for playing the Test Case... 
	
	// Proof Mass
	private GmailSubmitEmailObjectPage gSEOP;

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
		SeleniumWebDrivers sWD = new SeleniumWebDrivers();
		/* ...passing the method chooseWebDriver() as parameter... 
		 * And this method has an integer parameter in which it is responsible for the choice the webdriver.
		 */
		gSEOP = new GmailSubmitEmailObjectPage(sWD.chooseWebDriver(1));
	}

	// Steps to reproduce the functionality to be tested...
	@Test
	public void testGmailEmailSending() {
		gSEOP.accessHomePage();
		gSEOP.insertUser(user);
		gSEOP.clickNextButton();
		gSEOP.waitTwoSecondsPageLoad();
		gSEOP.insertPassword(password);
		gSEOP.clickSignInButton();
		gSEOP.waitTwentySecondsPageLoad();
		gSEOP.clickWriteEmailButton();
		gSEOP.waitTwoSecondsPageLoad();
		gSEOP.insertEmailAddressInSendBox(to);
		gSEOP.insertEmailSubjectInSendBox(subject);
		gSEOP.insertEmailBodyContentInSendBox(body);
		gSEOP.clickEmailSubmitButton();
		gSEOP.waitTwoSecondsPageLoad();
		gSEOP.clickSendConfirmationLink();
		gSEOP.checkTextInTheSentEmail(body);
		gSEOP.searchTextInTheSentEmail();
	}

	// Close the browser window after the test.
	@After
	public void tearDown() {
		gSEOP.closeBrowser();
	}
}
