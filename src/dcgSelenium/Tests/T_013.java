package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;
import dcgSelenium.Pages.SettingsPage;

public class T_013 extends BaseTest {

	@Test
	public void removeProject() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("newuser2@ds.com", "pass123");
		SettingsPage settingsPage = new SettingsPage(driver, wait);
		Thread.sleep(10000);
		settingsPage.removeProj();
		Thread.sleep(5000);
		homePage.goToPreview();
		Thread.sleep(5000);
	}

}
