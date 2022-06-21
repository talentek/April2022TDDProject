package com.ups.test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import com.ups.drivers.Drivers;
import com.ups.pageActions.UpsTrackingPageActions;

public class UpsTrackingPageTest extends Drivers {

	WebDriver driver;
	UpsTrackingPageActions actions;
	final String URL = "https://www.ups.com/track?loc=en_US&requester=ST/";

	public UpsTrackingPageTest() {
		this.driver = getChromeDriver();
		this.actions = new UpsTrackingPageActions(this.driver);
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void validateUpsTrackingErrorMsg_1() {
		actions.inputTrackingNumber("123456789");
		actions.clickTrackButton();
		String expectedErrorMessage = "Please provide a tracking number.";
		String actualErrorMessage = actions.getTrackingErrorMessage_1();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}
	
	@Test
	public void testCase_1() {
		Assert.assertEquals(1, 1);
	}
	
	@Test
	public void testCase_2() {
		Assert.assertEquals("Hello", "Hello");
	}
	

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.quit();
	}

}
