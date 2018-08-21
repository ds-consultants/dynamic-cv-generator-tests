package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;

public class T_003_logOut extends BaseTest {

	@Test
	public void logOut() {

		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("test@user.com", "asdasd1");
		homePage.signOut();

	}

}
