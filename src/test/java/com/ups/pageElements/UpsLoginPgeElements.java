package com.ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsLoginPgeElements {

	@FindBy(name = "userID")
	public WebElement userId;

	@FindBy(id = "pwd")
	public WebElement password;

	@FindBy(xpath = "//*[@id='submitBtn']")
	public WebElement submitBtn;

}
