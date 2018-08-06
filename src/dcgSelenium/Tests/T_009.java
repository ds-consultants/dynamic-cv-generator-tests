package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;
import dcgSelenium.Pages.UsersPage;

public class T_009 extends BaseTest {

	@Test
	public void selectUser() {
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);
		homePage.logInUrl();
		loginPage.LogIn("test@user.com", "asdasd1");
		UsersPage usersPage = new UsersPage(driver, wait);
		homePage.goToUsers();
		usersPage.selectUser();
	}

}
