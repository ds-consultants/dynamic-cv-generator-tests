package dcgSelenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsPage extends BasePage {

	public SettingsPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// basic info
	String nameid = "name";
	String titlechckid = "title";
	String professionalExpid = "professionalExpectations";
	String personalNoteid = "personalNote";

	// education
	String educationbtn = "education-add-button";
	String eduCity = "educationPlace";
	String eduTime = "educationTime";
	String eduName = "educationName";
	String eduNamePlace = "educationNamePlace";

	// experience
	String addExperienceBtn = "add-experience-button";
	String experiencePlace = "experiencePlace";
	String experienceTime = "experienceTime";
	String experiencePosition = "experiencePosition";
	String mainProjectPlace = "mainProjectPlace";
	String tagMainProject = "//*[@id='main-project-technologies']/tag-input/div/div/tag-input-form/form/input";
	String mainProjectAddBtn = "main-project-add-button";
	String projectName = "projectName";
	String projectTitle = "projectTitle";
	String projectPlace = "projectPlace";
	String projectTags = "//*[@id='project-technologies']/tag-input/div/div/tag-input-form/form/input";
	String projectAddBtn = "project-add-button";
	String saveExperience = "experience-save-button";

	// skills
	String skillsetAddBtn = "skillset-add-button";
	String skillName = "newSkillset";
	String skillSaveBtn = "skillset-save-button";
	String newTagField = "//tag-input-form[@class='ng-tns-c5-4']/form[1]/input[1]";

	// expected basic info
	String expectedName = "Jan Kowalski";
	String expectedTitle = "QA Consultant";
	String expectedExp = "test 123456789";
	String expectedNote = "test personal note 12345";

	// expected edu info
	String expectedEduCity = "Bialystok";
	String expectedEduTime = "2009-2013";
	String expectedEduName = "Computer Science";
	String expectedEduNamePlace = "Bialystok Technical University";
	// expected exp info
	String expectedExperiencePlace = "Company";
	String expectedExperienceTime = "2016-2018";
	String expectedExperiencePosition = "QA";
	String expectedMainProjectPlace = "Description";
	String expectedTagMainProject = "Java, Selenium, Eclipse";
	String expectedProjectName = "Name of project";
	String expectedProjectTitle = "QA";
	String expectedProjectPlace = "Description of project";
	String expectedProjectTags = "Selenium, Appium, Python";

	// expected skills
	String expectedSkillName = "My skills";
	String expectedTags = "Selenium, Python, Appium";

	String removeExpBtn = "experience-remove-button";
	String removeEduBtn = "education-remove-button";
	String removeSkillBtn = "skillset-my-skills-remove-button";
	String removeProjBtn = "project-remove-button";
	String removeMainProjBtn = "main-project-remove-button";
	String newHireBtn = "new-hire-button";

	public void fillBasicInfo() {

		driver.findElement(By.name(nameid)).clear();
		writeText(By.name(nameid), expectedName);
		Select oSelect = new Select(driver.findElement(By.name(titlechckid)));
		oSelect.selectByVisibleText(expectedTitle);
		driver.findElement(By.id(professionalExpid)).clear();
		writeText(By.id(professionalExpid), expectedExp);
		driver.findElement(By.id(personalNoteid)).clear();
		writeText(By.id(personalNoteid), expectedNote);
	}

	public void fillEducation() {
		driver.findElement(By.id(educationbtn)).click();
		writeText(By.name(eduCity), expectedEduCity);
		writeText(By.name(eduTime), expectedEduTime);
		writeText(By.name(eduName), expectedEduName);
		writeText(By.name(eduNamePlace), expectedEduNamePlace);
		driver.findElement(By.id("education-save-button")).click();
	}

	public void addBasciExperience() {
		driver.findElement(By.id(addExperienceBtn)).click();
		writeText(By.name(experiencePlace), expectedExperiencePlace);
		writeText(By.name(experienceTime), expectedExperienceTime);
		writeText(By.name(experiencePosition), expectedExperiencePosition);

	}

	public void addMainProject() {
		writeText(By.name(mainProjectPlace), expectedMainProjectPlace);
		driver.findElement(By.xpath(tagMainProject)).sendKeys(expectedTagMainProject);
		driver.findElement(By.xpath(tagMainProject)).sendKeys(Keys.ENTER);
		click(By.id(mainProjectAddBtn));
	}

	public void addProject() {
		writeText(By.name(projectName), expectedProjectName);
		writeText(By.name(projectTitle), expectedProjectTitle);
		writeText(By.name(projectPlace), expectedProjectPlace);
		driver.findElement(By.xpath(projectTags)).sendKeys(expectedProjectTags);
		driver.findElement(By.xpath(projectTags)).sendKeys(Keys.ENTER);
		click(By.id(projectAddBtn));
		click(By.id(saveExperience));

	}

	public void addSkills() {
		click(By.id(skillsetAddBtn));
		click(By.id(skillName));
		writeText(By.id(skillName), expectedSkillName);
		click(By.id(skillSaveBtn));
		driver.findElement(By.xpath(newTagField)).sendKeys(expectedTags);
		driver.findElement(By.xpath(newTagField)).sendKeys(Keys.ENTER);
	}

	public void removeExp() {
		click(By.id(removeExpBtn));
	}

	public void removeEdu() {
		click(By.id(removeEduBtn));
		driver.switchTo().alert().accept();
	}

	public void removeSkll() {
		click(By.id(removeSkillBtn));
		driver.switchTo().alert().accept();
	}

	public void removeProj() {
		click(By.id(removeProjBtn));
	}

	public void removeMainProj() {
		click(By.id(removeMainProjBtn));
	}

	public void addNewHire() {
		click(By.id(newHireBtn));
	}
}
