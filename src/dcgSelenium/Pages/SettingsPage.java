package dcgSelenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dcgSelenium.Pages.DOM.Settings_Page.BasicInfo;
import dcgSelenium.Pages.DOM.Settings_Page.Education;
import dcgSelenium.Pages.DOM.Settings_Page.Experience;
import dcgSelenium.Pages.DOM.Settings_Page.Skills;

public class SettingsPage extends BasePage {

	public SettingsPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
		
	}


	public void fillBasicInfo() {

		driver.findElement(By.name(BasicInfo.nameid)).clear();
		writeText(By.name(BasicInfo.nameid), BasicInfo.expectedName);
		Select oSelect = new Select(driver.findElement(By.name(BasicInfo.titlechckid)));
		oSelect.selectByVisibleText(BasicInfo.expectedTitle);
		driver.findElement(By.id(BasicInfo.professionalExpid)).clear();
		writeText(By.id(BasicInfo.professionalExpid), BasicInfo.expectedExp);
		driver.findElement(By.id(BasicInfo.personalNoteid)).clear();
		writeText(By.id(BasicInfo.personalNoteid), BasicInfo.expectedNote);
	}

	public void fillEducation() {
		driver.findElement(By.id(Education.educationbtn)).click();
		writeText(By.name(Education.eduCity), Education.expectedEduCity);
		writeText(By.name(Education.eduTime), Education.expectedEduTime);
		writeText(By.name(Education.eduName), Education.expectedEduName);
		writeText(By.name(Education.eduNamePlace), Education.expectedEduNamePlace);
		driver.findElement(By.id("education-save-button")).click();
	}

	public void addBasciExperience() {
		driver.findElement(By.id(Experience.addExperienceBtn)).click();
		writeText(By.name(Experience.experiencePlace), Experience.expectedExperiencePlace);
		writeText(By.name(Experience.experienceTime), Experience.expectedExperienceTime);
		writeText(By.name(Experience.experiencePosition), Experience.expectedExperiencePosition);

	}

	public void addMainProject() {
		writeText(By.name(Experience.mainProjectPlace), Experience.expectedMainProjectPlace);
		driver.findElement(By.xpath(Experience.tagMainProject)).sendKeys(Experience.expectedTagMainProject);
		driver.findElement(By.xpath(Experience.tagMainProject)).sendKeys(Keys.ENTER);
		click(By.id(Experience.mainProjectAddBtn));
	}

	public void addProject() {
		writeText(By.name(Experience.projectName), Experience.expectedProjectName);
		writeText(By.name(Experience.projectTitle), Experience.expectedProjectTitle);
		writeText(By.name(Experience.projectPlace), Experience.expectedProjectPlace);
		driver.findElement(By.xpath(Experience.projectTags)).sendKeys(Experience.expectedProjectTags);
		driver.findElement(By.xpath(Experience.projectTags)).sendKeys(Keys.ENTER);
		click(By.id(Experience.projectAddBtn));
		click(By.id(Experience.saveExperience));

	}

	public void addSkills() {
		click(By.id(Skills.skillsetAddBtn));
		click(By.id(Skills.skillName));
		writeText(By.id(Skills.skillName), Skills.expectedSkillName);
		click(By.id(Skills.skillSaveBtn));
		driver.findElement(By.xpath(Skills.newTagField)).sendKeys(Skills.expectedTags);
		driver.findElement(By.xpath(Skills.newTagField)).sendKeys(Keys.ENTER);
	}

	public void removeExp() {
		click(By.id(Skills.removeExpBtn));
	}

	public void removeEdu() {
		click(By.id(Skills.removeEduBtn));
		driver.switchTo().alert().accept();
	}

	public void removeSkll() {
		click(By.id(Skills.removeSkillBtn));
		driver.switchTo().alert().accept();
	}

	public void removeProj() {
		click(By.id(Skills.removeProjBtn));
	}

	public void removeMainProj() {
		click(By.id(Skills.removeMainProjBtn));
	}

	public void addNewHire() {
		click(By.id(Skills.newHireBtn));
	}
}
