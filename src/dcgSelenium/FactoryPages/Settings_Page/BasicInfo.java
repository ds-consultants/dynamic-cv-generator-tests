package dcgSelenium.FactoryPages.Settings_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dcgSelenium.Pages.SettingsPage;

public class BasicInfo extends SettingsPage{
	
	public static String nameid = "name";
	public static String titlechckid = "title";
	public static String professionalExpid = "professionalExpectations";
	public static String personalNoteid = "personalNote";
	
	// expected basic info
	public static String expectedName = "Jan Kowalski";
	public static String expectedTitle = "QA Consultant";
	public static String expectedExp = "test 123456789";
	public static String expectedNote = "test personal note 12345";

	public BasicInfo(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
		// TODO Auto-generated constructor stub
	}
	
	

	

}
