package dcgSelenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage extends BasePage {

	public UsersPage(WebDriver driver, WebDriverWait wait) {
			super(driver, wait);
	}
	
	String username = "//li[@id='user-4']/a[@class='setting-link' and 1]";
	
	
	
	public void selectUser() {
		driver.findElement(By.xpath(username)).click();
		
	}

}
