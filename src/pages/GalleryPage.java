package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GalleryPage extends BasicPage {

	public GalleryPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public WebElement getTitle() {
		return driver.findElement(By.xpath("//*[@class='title-style']"));
	}

}
