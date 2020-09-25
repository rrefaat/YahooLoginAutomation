package com.Yahoo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YahooLoginPage extends PageBase {

	public YahooLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "login-username")
	WebElement UsernameAttribute;

	@FindBy(id = "login-signin")
	WebElement NextBtn;

	@FindBy(id = "recaptcha-anchor-label")
	WebElement recaptchaAttribute;

	@FindBy(id = "recaptcha-anchor")
	WebElement recaptchaAnchor;

	@FindBy(id = "recaptcha-submit")
	WebElement ContinueBtn;

	@FindBy(id = "login-passwd")
	WebElement PasswdAttribute;

	@FindBy(id = "username-error")
	public WebElement usernameError;

	@FindBy(className = "error-msg")
	public WebElement passwdError;

	public void UserNameLogin(String UserName) {
		UsernameAttribute.sendKeys(UserName);
	}

	public void ClickNext() {
		ClickBtn(NextBtn);
	}

	public void recaptchaConfirm() {
		ClickBtn(recaptchaAnchor);
		ClickBtn(NextBtn);
	}

	public void PasswdLogin(String Passwd) {
		PasswdAttribute.sendKeys(Passwd);
	}

}
