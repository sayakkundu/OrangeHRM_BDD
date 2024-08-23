package com.StepDefinitions;

import com.Pages.LoginPage;
import com.TestBase.TestBase;
import com.Utils.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends TestBase {

	LoginPage loginPage = new LoginPage(driver);

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {

//		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("I enter correct username and password")
	public void i_enter_correct_username_and_password() {

		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
	}

	@And("I click on Login button")
	public void i_click_on_login_button() {

		loginPage.clickLoginButton();
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {

		System.out.println("Logged in");
//		String currURL = DriverFactory.getDriver().getCurrentUrl();
//		String name = DriverFactory.getDriver().getTitle();

//		System.out.println("URL: "+currURL);
//		System.out.println("Name: "+name);
	}

	@When("I enter incorrect username and password")
	public void i_enter_incorrect_username_and_password() {

		loginPage.enterUsername("test");
		loginPage.enterPassword("pq");
	}

	@Then("I should see an error message")
	public void i_should_see_an_error_message() {

		System.out.println("Alert: " + loginPage.getAlertMessage());
	}

	@And("I click on Forgot Password Link")
	public void i_click_on_forgot_password_link() {

		loginPage.clickOnForgotPasswordLink();
	}

	@And("I enter Usernames for the reset link to be sent to")
	public void i_enter_usernames_for_the_reset_link_to_be_sent_to() {

		loginPage.enterUserNameForResetUsername("Sayak");
	}

	@When("I click on Reset Password button")
	public void i_click_on_reset_password_button() {

		loginPage.clickOnResetPasswordButton();
	}

	@Then("A reset password link should be sent")
	public void a_reset_password_link_should_be_sent() {

		System.out.println("EMAIL: " + loginPage.getTextOfSuccessfullResetPasswordEmail());
	}

}
