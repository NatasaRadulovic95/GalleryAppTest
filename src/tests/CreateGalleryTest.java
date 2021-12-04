package tests;

import org.testng.annotations.Test;

public class CreateGalleryTest extends BasicTest {
	
	@Test
	public void createGalleryTest() {
		driver.get("https://gallery-app.vivifyideas.com/login");
		loginPage.logIn(username, password);
		galleryPage.getCreateGalleryButton().click();
		createGalleryPage.createGallery(title, description, urlImage);
		softAssert.assertTrue(galleryPage.getMyGallery().getText().contains(title));
		softAssert.assertAll();
	}
	
}
