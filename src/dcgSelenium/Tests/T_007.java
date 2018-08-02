package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;
import dcgSelenium.Pages.PreviewPage;
import dcgSelenium.Pages.SettingsPage;

public class T_007 extends BaseTest {

	@Test
	public void addExperience() throws InterruptedException {
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		PreviewPage previewPage = new PreviewPage(driver, wait);
		SettingsPage settingsPage = new SettingsPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("newuser2@ds.com", "pass123");
		Thread.sleep(5000);
		settingsPage.addBasciExperience();
		settingsPage.addMainProject();
		settingsPage.addProject();
		Thread.sleep(5000);
		homePage.goToPreview();
		Thread.sleep(1000);
		previewPage.checkExperience();

	}

}
