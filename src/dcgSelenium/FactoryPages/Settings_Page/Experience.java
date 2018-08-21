package dcgSelenium.FactoryPages.Settings_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dcgSelenium.Pages.SettingsPage;

public class Experience extends SettingsPage{

	// experience
		public static String addExperienceBtn = "add-experience-button";
		public static String experiencePlace = "experiencePlace";
		public static String experienceTime = "experienceTime";
		public static String experiencePosition = "experiencePosition";
		public static String mainProjectPlace = "mainProjectPlace";
		public static String tagMainProject = "//*[@id='main-project-technologies']/tag-input/div/div/tag-input-form/form/input";
		public static String mainProjectAddBtn = "main-project-add-button";
		public static String projectName = "projectName";
		public static String projectTitle = "projectTitle";
		public static String projectPlace = "projectPlace";
		public static String projectTags = "//*[@id='project-technologies']/tag-input/div/div/tag-input-form/form/input";
		public static String projectAddBtn = "project-add-button";
		public static String saveExperience = "experience-save-button";
		
		// expected exp info
		public static String expectedExperiencePlace = "Company";
		public static String expectedExperienceTime = "2016-2018";
		public static String expectedExperiencePosition = "QA";
		public static String expectedMainProjectPlace = "Description";
		public static String expectedTagMainProject = "Java, Selenium, Eclipse";
		public static String expectedProjectName = "Name of project";
		public static String expectedProjectTitle = "QA";
		public static String expectedProjectPlace = "Description of project";
		public static String expectedProjectTags = "Selenium, Appium, Python";
	
	
	
	public Experience(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	

}
