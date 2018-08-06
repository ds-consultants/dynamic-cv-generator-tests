package dcgSelenium.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// Click Method
	public void click(By elementLocation) {
		driver.findElement(elementLocation).click();
	}

	// Write Text
	public void writeText(By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(text);
	}

	// Read Text
	public String readText(By elementLocation) {
		return driver.findElement(elementLocation).getText();
	}

}
