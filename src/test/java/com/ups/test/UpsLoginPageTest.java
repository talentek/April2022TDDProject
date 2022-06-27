package com.ups.test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.ups.drivers.Drivers;
import com.ups.pageActions.UpsLoginPageActions;

public class UpsLoginPageTest extends Drivers {

	WebDriver driver;
	UpsLoginPageActions actions;
	final String URL = "https://www.ups.com/lasso/login";

//	public UpsLoginPageTest() {
//		this.driver = getChromeDriver();
//		this.actions = new UpsLoginPageActions(this.driver);
//	}

	@BeforeTest(alwaysRun = true)
	@Parameters(value = { "browser" })
	public void beforeTest(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			this.driver = getChromeDriver();
			this.actions = new UpsLoginPageActions(this.driver);

		} else if (browser.equalsIgnoreCase("firefox")) {
			this.driver = getFirefoxDriver();
			this.actions = new UpsLoginPageActions(this.driver);

		}

		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test(groups = { "sanityTest", "regressionTest" })
	public void upsLoginTestWrongUserId() throws InterruptedException {
		actions.inputUserId("user");
		actions.inputPassword("pass");
		actions.clickSubmitButton();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(URL, currentUrl);
	}

	@Test(groups = { "smokeTest" })
	public void smokeTest() {
		System.out.println("Default: Passed");
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.quit();
	}
}
