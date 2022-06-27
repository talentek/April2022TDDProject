package com.ups.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ups.pageElements.UpsLoginPgeElements;


public class UpsLoginPageActions {

	UpsLoginPgeElements elements;

	public UpsLoginPageActions(WebDriver driver) {
		this.elements = new UpsLoginPgeElements();
		PageFactory.initElements(driver, this.elements);
	}

	public void inputUserId(String userId) {
		this.elements.userId.sendKeys(userId);
	}
	
	public void inputPassword(String password) {
		this.elements.password.sendKeys(password);
	}

	public void clickSubmitButton() {
		this.elements.submitBtn.click();
	}

//	public String getTrackingErrorMessage_1() {
//		String errorMsg = this.elements.errorMsg_1.getText();
//		return errorMsg;
//	}
	
	
}
