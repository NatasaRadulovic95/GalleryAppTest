package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Helper;

public class MyGalleryPage extends BasicPage {

	public MyGalleryPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public WebElement getMyGalleriesButton() {
		return driver.findElement(By.xpath("//a[contains(text(), 'My Gall')]"));
	}
	public WebElement getEditGalleryButton() {
		return driver.findElement(By.xpath("//*[@class='btn btn-custom'][2]"));
		
	};
	
	public WebElement getMyTestTitleGallery() {
		return driver.findElement(By.xpath("//a[contains(text(), 'Test Title')]"));
	}
	
	public WebElement getNewTitle() {
		return driver.findElement(By.xpath("//*[@class='title-style']"));
	}
	
	public WebElement deleteGalleryButton() {
		return driver.findElement(By.xpath("//*[@class='btn btn-custom']"));
	}
	public void editGallery(String newTitle, String newDescription, String newImage) {
		
		this.getMyGalleriesButton().click();
		this.getMyTestTitleGallery().click();
		this.getEditGalleryButton().click();
		CreateGalleryPage createGallery = new CreateGalleryPage(driver, wait);
		createGallery.getTitleIput().clear();
		createGallery.getTitleIput().sendKeys(newTitle);
		createGallery.getDescriptionInput().clear();
		createGallery.getDescriptionInput().sendKeys(newDescription);
		createGallery.getImageUrlInput().clear();
		createGallery.getImageUrlInput().sendKeys(newImage);
		createGallery.getSubmitButton().click();
		
	}
	
	public void deleteGallery() {
		Helper.scrollToElementJS(this.deleteGalleryButton(), driver);
		this.deleteGalleryButton().click();
	}
}
