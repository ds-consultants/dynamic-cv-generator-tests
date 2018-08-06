package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;
import dcgSelenium.Pages.PreviewPage;
import dcgSelenium.Pages.SettingsPage;

public class T_007 extends BaseTest {

	@Test
	public void addExperience() {
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		PreviewPage previewPage = new PreviewPage(driver, wait);
		SettingsPage settingsPage = new SettingsPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("newuser2@ds.com", "pass123");
		settingsPage.addBasciExperience();
		settingsPage.addMainProject();
		settingsPage.addProject();
		homePage.goToPreview();
		previewPage.checkExperience();

	}

}
