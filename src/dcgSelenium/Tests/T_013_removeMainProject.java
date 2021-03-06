package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;
import dcgSelenium.Pages.SettingsPage;

public class T_013_removeMainProject extends BaseTest {

	@Test
	public void removeMainProject() {
		
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("newuser2@ds.com", "pass123");
		SettingsPage settingsPage = new SettingsPage(driver, wait);
		settingsPage.removeMainProj();
		homePage.goToPreview();
	}

}
