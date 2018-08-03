package dcgSelenium.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);

	}

	@AfterClass
	public void tearDown() {

		driver.quit();

	}

}
