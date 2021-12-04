package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateGalleryPage extends BasicPage {

	public CreateGalleryPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public WebElement getTitleIput() {
		return driver.findElement(By.id("title"));
	}
	
	public WebElement getDescriptionInput() {
		return driver.findElement(By.id("description"));
	}
	
	public WebElement getImageUrlInput() {
		return driver.findElement(By.xpath("//*[@class='input-group mb-3']/input"));
		
	}

	public WebElement getAddImageButton() {
		return driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
		
	}
	
	public WebElement getSubmitButton() {
		return driver.findElement(By.xpath("//button[contains(text(), 'Submit')]"));
	}
	
	public void createGallery(String title, String description, String url){
		this.getTitleIput().clear();
		this.getTitleIput().sendKeys(title);
		this.getDescriptionInput().clear();
		this.getDescriptionInput().sendKeys(description);
		this.getImageUrlInput().clear();
		this.getImageUrlInput().sendKeys(url);
		this.getSubmitButton().click();
	}
		
	}

