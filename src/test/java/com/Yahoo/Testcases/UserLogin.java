package com.Yahoo.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Yahoo.Pages.YahooLoginPage;

public class UserLogin extends TestBase {
	YahooLoginPage LoginPageObj;

	@Test(enabled = false)
	public void UsernameLoginCorrectly() {
		LoginPageObj = new YahooLoginPage(driver);
		LoginPageObj.UserNameLogin("testtask54");
		LoginPageObj.ClickNext();
		// LoginPageObj.recaptchaConfirm();
		LoginPageObj.PasswdLogin("123456$$$");
		LoginPageObj.ClickNext();
	}

	@Test(enabled = false)
	public void MailLoginCorrectly() {
		LoginPageObj = new YahooLoginPage(driver);
		LoginPageObj.UserNameLogin("testtask54@yahoo.com");
		LoginPageObj.ClickNext();
		// LoginPageObj.recaptchaConfirm();
		LoginPageObj.PasswdLogin("123456$$$");
		LoginPageObj.ClickNext();
	}

	@Test(enabled = false)
	public void UsernameLoginFail() {
		LoginPageObj = new YahooLoginPage(driver);
		LoginPageObj.UserNameLogin("testtask");
		Assert.assertTrue(LoginPageObj.usernameError.getText().contains("Sorry, we don't recognize this email."));
	}

	@Test(enabled = false)
	public void MailLoginFail() {
		LoginPageObj = new YahooLoginPage(driver);
		LoginPageObj.UserNameLogin("testtask@yahoo.com");
		Assert.assertTrue(LoginPageObj.usernameError.getText().contains("Sorry, we don't recognize this email."));

	}

	@Test(enabled = false)
	public void MailPasswdLoginFail() {
		LoginPageObj = new YahooLoginPage(driver);
		LoginPageObj.UserNameLogin("testtask54@yahoo.com");
		LoginPageObj.ClickNext();
		// LoginPageObj.recaptchaConfirm();
		LoginPageObj.PasswdLogin("123456");
		Assert.assertTrue(LoginPageObj.passwdError.getText().contains("Invalid password. Please try again"));
	}

	@Test
	public void UsernamePasswdLoginFail() {
		LoginPageObj = new YahooLoginPage(driver);
		LoginPageObj.UserNameLogin("testtask54");
		LoginPageObj.ClickNext();
		// LoginPageObj.recaptchaConfirm();
		LoginPageObj.PasswdLogin("123456");
		LoginPageObj.ClickNext();
		Assert.assertTrue(LoginPageObj.passwdError.getText().contains("Invalid password. Please try again"));
	}

}
