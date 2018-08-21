package dcgSelenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	
	
		
	}

	String loginURL = "https://dynamic-cv-generator-test.firebaseapp.com/login";
	String registerURL = "https://dynamic-cv-generator-test.firebaseapp.com/signup";
	String signInButtonClass = "button";
	String signoutbtn = "signout-nav-button";

	String settingsbtn = "settings-nav-button";
	String previewbtn = "preview-nav-button";
	String usersbtn = "users-nav-button";

	public void logInUrl() {
		driver.get(loginURL);
	}

	public void registerUrl() {
		driver.get(registerURL);
	}

	public void goToLoginPage() {
		click(By.className(signInButtonClass));
	}

	public void signOut() {
		click(By.id(signoutbtn));
	}

	public void goToSettings() {
		click(By.id(settingsbtn));
	}

	public void goToUsers() {
		click(By.id(usersbtn));
	}

	public void goToPreview() {
		click(By.id(previewbtn));
	}

}
