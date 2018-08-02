package dcgSelenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PreviewPage extends SettingsPage {

	public PreviewPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
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
	private static final String actualMainProjectPlaceLocator = "//*[@id='inline-project-description' and @class='ng-untouched ng-valid ng-dirty']/div[1]/a[1]";
	private static final String actualTagMainProjectLocator = "//div[1]/app-project[1]/p[3]/app-project-technologies[1]/span[1]";
	private static final String actualProjectNameLocator = "//*[@id='inline-project-name']/div[1]/a[1]";
	private static final String actualProjectTitleLocator = "//*[@id='inline-project-professional-title']/div[1]/a[1]";
	private static final String actualProjectPlaceLocator = "//*[@class='ng-untouched ng-valid ng-dirty']/div[1]/a[1]";
	private static final String actualProjectTagsLocator = "//*[@class='ds-project']/p[3]/app-project-technologies[1]/span[1]";

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

	@Test
	public void checkBaiscInfo() {
		Assert.assertEquals(actualName.getText(), expectedName);
		Assert.assertEquals(actualTitle.getText(), expectedTitle);
		Assert.assertEquals(actualExpect.getText(), expectedExp);
		Assert.assertEquals(actualNote.getText(), expectedNote);
	}

	@Test
	public void checkEducation() {
		Assert.assertEquals(actualEduTime.getText(), expectedEduTime);
		Assert.assertEquals(actualEduName.getText(), expectedEduName);
		Assert.assertEquals(actualEduNamePlace.getText(), expectedEduNamePlace);
		Assert.assertEquals(actualEduCity.getText(), expectedEduCity);
	}

	@Test
	public void checkExperience() {
		Assert.assertEquals(actualExpPlace.getText(), expectedExperiencePlace);
		Assert.assertEquals(actualExpTime.getText(), expectedExperienceTime);
		Assert.assertEquals(actualExpPostition.getText(), expectedExperiencePosition);
		Assert.assertEquals(actualMainProjectPlace.getText(), expectedMainProjectPlace);
		Assert.assertEquals(actualTagMainProject.getText(), expectedTagMainProject);
		Assert.assertEquals(actualProjectName.getText(), expectedProjectName);
		Assert.assertEquals(actualProjectTitle.getText(), expectedProjectTitle);
		Assert.assertEquals(actualProjectPlace.getText(), expectedProjectPlace);
		Assert.assertEquals(actualProjectTags.getText(), expectedProjectTags);
	}

}
