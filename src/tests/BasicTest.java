package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import helper.Helper;
import pages.GalleryPage;
import pages.LogInPage;


abstract class BasicTest {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected SoftAssert softAssert;
	protected LogInPage loginPage;
	protected GalleryPage galleryPage;
	
	protected String username = "test@test.t";
	protected String password = "12345678";
	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Info\\Desktop\\chromedriver3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		softAssert = new SoftAssert();
		loginPage = new LogInPage(driver, wait);
		galleryPage = new GalleryPage(driver, wait);
		
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException, IOException {
		Thread.sleep(2000);
//		Helper.screenshot(driver);
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
//		driver.quit();
	}
}
