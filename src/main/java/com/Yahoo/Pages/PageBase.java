package com.Yahoo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;

	public PageBase(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	protected static void ClickBtn(WebElement btn) {
		btn.click();
	}

}
