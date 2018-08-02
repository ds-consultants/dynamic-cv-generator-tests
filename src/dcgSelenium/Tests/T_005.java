package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;
import dcgSelenium.Pages.PreviewPage;
import dcgSelenium.Pages.SettingsPage;

public class T_005 extends BaseTest {

	@Test
	public void addBasicInfo() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		PreviewPage previewPage = new PreviewPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("newuser2@ds.com", "pass123");
		Thread.sleep(5000);
		// homePage.goToSettings();
		SettingsPage settingsPage = new SettingsPage(driver, wait);
		settingsPage.fillBasicInfo();
		Thread.sleep(5000);
		homePage.goToPreview();
		Thread.sleep(10000);
		previewPage.checkBaiscInfo();

	}
}
