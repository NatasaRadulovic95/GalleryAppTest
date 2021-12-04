package tests;

import org.testng.annotations.Test;

public class LogInTest extends BasicTest {

	
	@Test 
	public void LoginTest() {
		driver.get("https://gallery-app.vivifyideas.com/login");
		loginPage.logIn(username, password);
		softAssert.assertTrue(galleryPage.getTitle().isDisplayed());
	}
}
