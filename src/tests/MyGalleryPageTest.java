package tests;

import org.testng.annotations.Test;

public class MyGalleryPageTest extends BasicTest{
	
	@Test
	public void myGalleryPageTest() throws InterruptedException {
		driver.get("https://gallery-app.vivifyideas.com/login");
		loginPage.logIn(username, password);
		myGalleryPage.editGallery(newTitle, newDescription, newUrlImage);
		Thread.sleep(1000);
		softAssert.assertEquals(myGalleryPage.getNewTitleText(), newTitle.toUpperCase());
		softAssert.assertAll();

		
	}
	


}
