package dcgSelenium.Tests;

import org.testng.annotations.Test;
import dcgSelenium.Pages.HomePage;
import dcgSelenium.Pages.LoginPage;

public class T_001_logIn extends BaseTest {

	@Test(priority = 0)
	public void loginCorrect() {

		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver, wait);

		homePage.logInUrl();

		homePage.goToLoginPage();

		loginPage.LogIn("newuser2@ds.com", "pass123");
	}

	/*
	 * @Test (priority = 1) public void loginIncorrect() throws InterruptedException
	 * {
	 * 
	 * HomePage homePage = new HomePage(driver,wait); LoginPage loginPage = new
	 * LoginPage(driver,wait);
	 * 
	 * //*************PAGE METHODS******************** homePage.logInUrl();
	 * 
	 * homePage.goToLoginPage();
	 * 
	 * loginPage.LogIn("test", "a12");
	 * 
	 * 
	 * //ASSERTIONS Thread.sleep(500); loginPage.verifyLoginUserName("test");
	 * loginPage.verifyLoginPassword("a12"); }
	 */

}
