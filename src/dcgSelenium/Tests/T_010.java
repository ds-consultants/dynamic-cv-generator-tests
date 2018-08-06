package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;
import dcgSelenium.Pages.SettingsPage;


public class T_010 extends BaseTest {

	@Test
	public void removeExperirence() {
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("newuser2@ds.com", "pass123");
		SettingsPage settingsPage = new SettingsPage(driver, wait);
		settingsPage.removeExp();
	}

}
