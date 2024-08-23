package com.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	}

	@FindBy(css = "input[name='username']")
	private WebElement username;

	@FindBy(css = "	input[name='password']")
	private WebElement password;
	
	@FindBy(css = "button[type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div/p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement alertMessage;
	
	@FindBy(css = "p[class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	private WebElement forgotPasswordLink;
	
	@FindBy(css = "input[name='username']")
	private WebElement resetUsername;
	
	@FindBy(css = "button[type='submit']")
	private WebElement resetPasswordButton;
	
	@FindBy(tagName = "h6")
	private WebElement text_successMsgResetPassword;
	
	public void enterUsername(String user) {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(pass);
	}
	
	public void clickLoginButton() {
		
		loginButton.click();
	}
	
	public String getAlertMessage() {
		wait.until(ExpectedConditions.visibilityOf(alertMessage));
		return alertMessage.getText();
	}
	
	public void clickOnForgotPasswordLink() {
		wait.until(ExpectedConditions.visibilityOf(forgotPasswordLink));
		forgotPasswordLink.click();
	}
	
	public void enterUserNameForResetUsername(String newUsername) {
		wait.until(ExpectedConditions.visibilityOf(resetUsername));
		resetUsername.sendKeys(newUsername);
	}
	
	public void clickOnResetPasswordButton() {
		
		resetPasswordButton.click();
	}
	
	public String getTextOfSuccessfullResetPasswordEmail() {
		wait.until(ExpectedConditions.visibilityOf(text_successMsgResetPassword));
		return text_successMsgResetPassword.getText();
	}
}

