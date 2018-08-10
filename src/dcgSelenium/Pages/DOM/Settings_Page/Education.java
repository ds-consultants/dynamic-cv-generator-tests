package dcgSelenium.Pages.DOM.Settings_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dcgSelenium.Pages.SettingsPage;

public class Education extends SettingsPage{

	// education
		public static String educationbtn = "education-add-button";
		public static String eduCity = "educationPlace";
		public static String eduTime = "educationTime";
		public static String eduName = "educationName";
		public static String eduNamePlace = "educationNamePlace";
		
		// expected edu info
		public static String expectedEduCity = "Bialystok";
		public static String expectedEduTime = "2009-2013";
		public static String expectedEduName = "Computer Science";
		public static String expectedEduNamePlace = "Bialystok Technical University";
	
	
	public Education(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

}
