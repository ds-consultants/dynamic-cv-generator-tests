package dcgSelenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import dcgSelenium.FactoryPages.Settings_Page.BasicInfo;
import dcgSelenium.FactoryPages.Settings_Page.Education;
import dcgSelenium.FactoryPages.Settings_Page.Experience;
import dcgSelenium.FactoryPages.Settings_Page.Skills;

public class PreviewPage extends SettingsPage {

	public PreviewPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
		
	}

	private static final String actualNameLocator = "//*[@id='inline-header-name']/div[1]/a[1]";
	private static final String actualTitleLocator = "//*[@id='inline-header-title']/div[1]/a[1]";
	private static final String actualExpectLocator = "//*[@id='inline-user-professional-expectations']/div[1]/a[1]";
	private static final String actualNoteLocator = "//*[@id='inline-user-personal-note']/div[1]/a[1]";

	private static final String actualEduTimeLocator = "//*[@id='inline-education-time-period']/div[1]/a[1]";
	private static final String actualEduNameLocator = "//*[@id='inline-education-academic-degree']/div[1]/a[1]";
	private static final String actualEduNamePlaceLocator = "//*[@id='inline-education-univerity-name']/div[1]/a[1]";
	private static final String actualEduCityLocator = "//*[@id='inline-education-city']/div[1]/a[1]";

	private static final String actualExpPlaceLocator = " //*[@id='inline-experience-company-name']/div[1]/a[1]";
	private static final String actualExpTimeLocator = "//*[@id='inline-experience-time-period']/div[1]/a[1]";
	private static final String actualExpPositionLocator = "//*[@id='inline-experience-professional-title']/div[1]/a[1]";
	private static final String actualMainProjectPlaceLocator = "//div[1]/app-project[1]/div[@class='project-row' and 1]/p[@class='description' and 2]/inline-editor[@id='inline-project-description' and @class='ng-untouched ng-pristine ng-valid' and 1]/div[1]/a[1]";
	private static final String actualTagMainProjectLocator = "//div[1]/app-project[1]/div[@class='project-row' and 1]/p[@class='technologies ng-star-inserted' and 3]/app-project-technologies[1]/span[@class='ng-star-inserted' and 1]";
	private static final String actualProjectNameLocator = "//*[@id='inline-project-name']/div[1]/a[1]";
	private static final String actualProjectTitleLocator = "//*[@id='inline-project-professional-title']/div[1]/a[1]";
	private static final String actualProjectPlaceLocator = "//app-project[@class='ds-project']/div[@class='project-row' and 1]/p[@class='description' and 2]/inline-editor[@id='inline-project-description' and @class='ng-untouched ng-pristine ng-valid' and 1]/div[@id='inlineEditWrapper' and 1]/a[@class='c-inline-editor' and 1]";
	private static final String actualProjectTagsLocator = "//app-project[@class='ds-project']/div[@class='project-row' and 1]/p[@class='technologies ng-star-inserted' and 3]/app-project-technologies[1]/span[@class='ng-star-inserted' and 1]";

	private static final String actualSkillTagLocator = "//li[@class='main-skill ng-star-inserted']";

	@FindBy(xpath = actualNameLocator)
	WebElement actualName;
	@FindBy(xpath = actualTitleLocator)
	WebElement actualTitle;
	@FindBy(xpath = actualExpectLocator)
	WebElement actualExpect;
	@FindBy(xpath = actualNoteLocator)
	WebElement actualNote;

	@FindBy(xpath = actualEduTimeLocator)
	WebElement actualEduTime;
	@FindBy(xpath = actualEduNameLocator)
	WebElement actualEduName;
	@FindBy(xpath = actualEduNamePlaceLocator)
	WebElement actualEduNamePlace;
	@FindBy(xpath = actualEduCityLocator)
	WebElement actualEduCity;

	@FindBy(xpath = actualExpPlaceLocator)
	WebElement actualExpPlace;
	@FindBy(xpath = actualExpTimeLocator)
	WebElement actualExpTime;
	@FindBy(xpath = actualExpPositionLocator)
	WebElement actualExpPostition;
	@FindBy(xpath = actualMainProjectPlaceLocator)
	WebElement actualMainProjectPlace;
	@FindBy(xpath = actualTagMainProjectLocator)
	WebElement actualTagMainProject;
	@FindBy(xpath = actualProjectNameLocator)
	WebElement actualProjectName;
	@FindBy(xpath = actualProjectTitleLocator)
	WebElement actualProjectTitle;
	@FindBy(xpath = actualProjectPlaceLocator)
	WebElement actualProjectPlace;
	@FindBy(xpath = actualProjectTagsLocator)
	WebElement actualProjectTags;

	@FindBy(xpath = actualSkillTagLocator)
	WebElement actualSkillTag;

	@Test
	public void checkBaiscInfo() {
		Assert.assertEquals(actualName.getText(), BasicInfo.expectedName);
		Assert.assertEquals(actualTitle.getText(), BasicInfo.expectedTitle);
		Assert.assertEquals(actualExpect.getText(), BasicInfo.expectedExp);
		Assert.assertEquals(actualNote.getText(), BasicInfo.expectedNote);
	}

	@Test
	public void checkEducation() {
		Assert.assertEquals(actualEduTime.getText(), Education.expectedEduTime);
		Assert.assertEquals(actualEduName.getText(), Education.expectedEduName);
		Assert.assertEquals(actualEduNamePlace.getText(), Education.expectedEduNamePlace);
		Assert.assertEquals(actualEduCity.getText(), Education.expectedEduCity);
	}

	@Test
	public void checkExperience() {
		Assert.assertEquals(actualExpPlace.getText(), Experience.expectedExperiencePlace);
		Assert.assertEquals(actualExpTime.getText(), Experience.expectedExperienceTime);
		Assert.assertEquals(actualExpPostition.getText(), Experience.expectedExperiencePosition);
		Assert.assertEquals(actualMainProjectPlace.getText(), Experience.expectedMainProjectPlace);
		Assert.assertEquals(actualTagMainProject.getText(), Experience.expectedTagMainProject);
		Assert.assertEquals(actualProjectName.getText(), Experience.expectedProjectName);
		Assert.assertEquals(actualProjectTitle.getText(), Experience.expectedProjectTitle);
		Assert.assertEquals(actualProjectPlace.getText(), Experience.expectedProjectPlace);
		Assert.assertEquals(actualProjectTags.getText(), Experience.expectedProjectTags);
	}

	@Test
	public void checkSkills() {
		Assert.assertEquals(actualSkillTag.getText(), Skills.expectedTags);
	}

}
