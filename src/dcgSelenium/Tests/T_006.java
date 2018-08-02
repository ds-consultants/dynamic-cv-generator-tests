package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;
import dcgSelenium.Pages.PreviewPage;
import dcgSelenium.Pages.SettingsPage;

public class T_006 extends BaseTest {

	@Test
	public void addEducation() throws InterruptedException {
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		PreviewPage previewPage = new PreviewPage(driver, wait);
		SettingsPage settingsPage = new SettingsPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("newuser2@ds.com", "pass123");
		Thread.sleep(5000);
		settingsPage.fillEducation();
		Thread.sleep(500);
		homePage.goToPreview();
		Thread.sleep(10000);
		previewPage.checkEducation();
		Thread.sleep(500);
	}
}
