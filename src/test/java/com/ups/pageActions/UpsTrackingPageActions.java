package com.ups.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ups.pageElements.UpsTrackingPageElements;

public class UpsTrackingPageActions {

	UpsTrackingPageElements elements;

	public UpsTrackingPageActions(WebDriver driver) {
		this.elements = new UpsTrackingPageElements();
		PageFactory.initElements(driver, this.elements);
	}

	public void inputTrackingNumber(String trackingNumber) {
		this.elements.trackingInput.sendKeys(trackingNumber);
	}

	public void clickTrackButton() {
		this.elements.trackButton.click();
	}

	public String getTrackingErrorMessage_1() {
		String errorMsg = this.elements.errorMsg_1.getText();
		return errorMsg;
	}

}
