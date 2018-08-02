package dcgSelenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert; 

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// web elements
	String emailId = "email";
	String passwordId = "password";
	String loginButtonId = "button";

	String errorMessageEmailXpath = "//*[@id=\"main-content-canvas\"]/app-user-login/div/div/form/div[1]/div";
	String errorMessagePasswordXpath = "//*[@id=\"main-content-canvas\"]/app-user-login/div/div/form/div[2]/div";

	// page methods
	public void LogIn(String email, String password) {

		writeText(By.id(emailId), email);

		writeText(By.id(passwordId), password);

		click(By.className(loginButtonId));
	}

	//TODO 
	// Verify Email Condition
	public void verifyLoginUserName(String expectedText) {
		Assert.assertEquals(readText(By.xpath(errorMessageEmailXpath)), expectedText);
	}

	// Verify Password Condition
	public void verifyLoginPassword(String expectedText) {
		Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
	}

}
