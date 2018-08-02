package dcgSelenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// web elements
	String emailId = "email";
	String passwordId = "password";
	String passwordConfirmationId = "password-confirmation";
	String submitbtn = "button";

	public void registerUser(String email, String password) {
		writeText(By.id(emailId), email);
		writeText(By.id(passwordId), password);
		driver.findElement(By.id(passwordConfirmationId)).clear();
		writeText(By.id(passwordConfirmationId), password);
		click(By.className(submitbtn));
	}
}
