package br.com.tests.gmail.model;

import org.openqa.selenium.By;

// This model contains the page locators...
public class GmailLocator {

	private String url = "https://mail.google.com/";

	private By usernameLocator = By.id("Email");
	private By passwordLocator = By.id("Passwd");
	private By nextButtonLocator = By.id("next");
	private By signInButtonLocator = By.id("signIn");
	private By writeEmailButtonLocator = By.xpath("//div[contains(text(), 'ESCREVER')]");
	private By toLocator = By.xpath("//textarea[@aria-label='Para']");
	private By subjectLocator = By.name("subjectbox");
	private By bodyLocator = By.xpath("//div[@aria-label='Corpo da mensagem']");
	private By emailSubmitLocator = By.xpath("//div[contains(text(), 'Enviar')]");
	private By sendConfirmationLinkLocator = By.xpath("//span[contains(text(), 'Exibir mensagem')]");
	private String emailBodyContent = "Teste Teste Teste Teste Teste Teste Teste Teste Teste...";
	private By emailBodyContentLocator1 = By.xpath("//div[contains(@dir, 'ltr') and .//text()='" + getEmailBodyContent() + "']");
	private By emailBodyContentLocator2 = By.xpath("//*[contains(text(), '" + getEmailBodyContent() + "')]");

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public By getUsernameLocator() {
		return usernameLocator;
	}

	public void setUsernameLocator(By usernameLocator) {
		this.usernameLocator = usernameLocator;
	}

	public By getPasswordLocator() {
		return passwordLocator;
	}

	public void setPasswordLocator(By passwordLocator) {
		this.passwordLocator = passwordLocator;
	}

	public By getNextButtonLocator() {
		return nextButtonLocator;
	}

	public void setNextButtonLocator(By nextButtonLocator) {
		this.nextButtonLocator = nextButtonLocator;
	}

	public By getSignInButtonLocator() {
		return signInButtonLocator;
	}

	public void setSignInButtonLocator(By signInButtonLocator) {
		this.signInButtonLocator = signInButtonLocator;
	}

	public By getWriteEmailButtonLocator() {
		return writeEmailButtonLocator;
	}

	public void setWriteEmailButtonLocator(By writeEmailButtonLocator) {
		this.writeEmailButtonLocator = writeEmailButtonLocator;
	}

	public By getToLocator() {
		return toLocator;
	}

	public void setToLocator(By toLocator) {
		this.toLocator = toLocator;
	}

	public By getSubjectLocator() {
		return subjectLocator;
	}

	public void setSubjectLocator(By subjectLocator) {
		this.subjectLocator = subjectLocator;
	}

	public By getBodyLocator() {
		return bodyLocator;
	}

	public void setBodyLocator(By bodyLocator) {
		this.bodyLocator = bodyLocator;
	}

	public By getEmailSubmitLocator() {
		return emailSubmitLocator;
	}

	public void setEmailSubmitLocator(By emailSubmitLocator) {
		this.emailSubmitLocator = emailSubmitLocator;
	}

	public By getSendConfirmationLinkLocator() {
		return sendConfirmationLinkLocator;
	}

	public void setSendConfirmationLinkLocator(By sendConfirmationLinkLocator) {
		this.sendConfirmationLinkLocator = sendConfirmationLinkLocator;
	}

	public String getEmailBodyContent() {
		return emailBodyContent;
	}

	public void setEmailBodyContent(String emailBodyContent) {
		this.emailBodyContent = emailBodyContent;
	}

	public By getEmailBodyContentLocator1() {
		return emailBodyContentLocator1;
	}

	public void setEmailBodyContentLocator1(By emailBodyContentLocator1) {
		this.emailBodyContentLocator1 = emailBodyContentLocator1;
	}

	public By getEmailBodyContentLocator2() {
		return emailBodyContentLocator2;
	}

	public void setEmailBodyContentLocator2(By emailBodyContentLocator2) {
		this.emailBodyContentLocator2 = emailBodyContentLocator2;
	}
}