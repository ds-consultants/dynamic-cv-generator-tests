package dcgSelenium.FactoryPages.Settings_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dcgSelenium.Pages.SettingsPage;

public class Skills extends SettingsPage{

	// skills
	public static String skillsetAddBtn = "skillset-add-button";
	public static String skillName = "newSkillset";
	public static String skillSaveBtn = "skillset-save-button";
	public static String newTagField = "//tag-input-form[@class='ng-tns-c5-4']/form[1]/input[1]";

	// expected skills
	public static String expectedSkillName = "My skills";
	public static String expectedTags = "Selenium, Python, Appium";

	public static String removeExpBtn = "experience-remove-button";
	public static String removeEduBtn = "education-remove-button";
	public static String removeSkillBtn = "skillset-my-skills-remove-button";
	public static String removeProjBtn = "project-remove-button";
	public static String removeMainProjBtn = "main-project-remove-button";
	public static String newHireBtn = "new-hire-button";

	public Skills(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

}
