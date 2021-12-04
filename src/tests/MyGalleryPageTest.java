package tests;

import org.testng.annotations.Test;

public class MyGalleryPageTest extends BasicTest{
	
	@Test
	public void myGalleryPageTest() {
		driver.get("https://gallery-app.vivifyideas.com/login");
		loginPage.logIn(username, password);
		myGalleryPage.editGallery(newTitle, newDescription, newUrlImage);
		
		softAssert.assertTrue(myGalleryPage.getNewTitle().getText().contains(newTitle));
		softAssert.assertAll();
		
		myGalleryPage.deleteGallery();
	}

}
