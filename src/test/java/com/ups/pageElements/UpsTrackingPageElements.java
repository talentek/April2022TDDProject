package com.ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsTrackingPageElements {

	@FindBy(id = "stApp_trackingNumber")
	public WebElement trackingInput;

	@FindBy(id = "stApp_btnTrack")
	public WebElement trackButton;

	@FindBy(id = "stApp_lblInfoNotice")
	public WebElement errorMsg_1;

}
