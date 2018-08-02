package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.RegisterPage;

public class T_003 extends BaseTest {

	@Test
	public void registerUser() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		RegisterPage registerPage = new RegisterPage(driver, wait);

		homePage.registerUrl();
		registerPage.registerUser("newuser2@ds.com", "pass123");
		// homePage.goToLoginPage();
		Thread.sleep(5000);
	}

}
