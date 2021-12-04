package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasicPage {

	public LogInPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public WebElement getEmailFiled() {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getPasswordFiled() {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getSubmitButton() {
		return driver.findElement(By.xpath("//*[@class='btn btn-custom']"));
		
	}
	
	public void logIn(String email, String password) {
		this.getEmailFiled().clear();
		this.getEmailFiled().sendKeys(email);
		this.getPasswordFiled().clear();
		this.getPasswordFiled().sendKeys(password);
		this.getSubmitButton().click();
	}
}
