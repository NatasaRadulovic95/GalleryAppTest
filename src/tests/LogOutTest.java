package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends BasicTest {

	@Test 
	public void logOutTest() throws InterruptedException {
		driver.get("https://gallery-app.vivifyideas.com/login");
		loginPage.logIn(username, password);
		myGalleryPage.logOutButton().click();
		Thread.sleep(500);
		Assert.assertTrue(myGalleryPage.getLoginButton().isDisplayed());
		
	}
}
