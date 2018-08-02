package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;

public class T_004 extends BaseTest {

	@Test
	public void logOut() throws InterruptedException {

		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("test@user.com", "asdasd1");

		Thread.sleep(5000);

		homePage.signOut();

	}

}
