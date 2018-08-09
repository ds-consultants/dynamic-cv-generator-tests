package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.RegisterPage;

public class T_002_registerUser extends BaseTest {

	@Test
	public void registerUser() {

		HomePage homePage = new HomePage(driver, wait);
		RegisterPage registerPage = new RegisterPage(driver, wait);

		homePage.registerUrl();
		registerPage.registerUser("newuser23@ds.com", "pass123");
		homePage.goToLoginPage();
	}

}
