package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;
import dcgSelenium.Pages.SettingsPage;

public class T_014 extends BaseTest {

	@Test
	public void removeMainProject() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("newuser2@ds.com", "pass123");
		SettingsPage settingsPage = new SettingsPage(driver, wait);
		Thread.sleep(10000);
		settingsPage.removeMainProj();
		Thread.sleep(500);
		homePage.goToPreview();
		Thread.sleep(5000);
	}

}