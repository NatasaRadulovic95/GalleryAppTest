package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	public String getNewTitleText() {
		return driver.findElement(By.xpath("//h1[@class='title-style']")).getText();
	}
	
	public WebElement deleteGalleryButton() {
		return driver.findElement(By.xpath("//*[@class='btn btn-custom']"));
	}
	
	public WebElement logOutButton() {
		return driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//a[contains(text(), 'Login')]"));
		
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
	
	public void deleteGallery() throws InterruptedException {
		Helper.scrollToElementJS(this.deleteGalleryButton(), driver);
		this.deleteGalleryButton().click();
		Thread.sleep(500);
		Keys.ENTER.getKeyFromUnicode(a);
	}
}
