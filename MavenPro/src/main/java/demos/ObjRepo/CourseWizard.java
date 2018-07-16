package demos.ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseWizard {
	@FindBy(xpath=".//*[@id='course_name_idd']")
	private WebElement LessonName;
	@FindBy(xpath=".//*[@id='course_desc_idd']")
	private WebElement LessonDescription;
	@FindBy(xpath=".//*[@id='course_category_idd']")
	private WebElement LessonCategory;
	@FindBy(xpath="//a[text()='Next']")
	private WebElement NextBtn;
	 
	public void Create_NewCourse(String CourseName,String CourseDescription,String CourseCategory)
	{
		LessonName.sendKeys(CourseName);
		LessonDescription.sendKeys(CourseDescription);
		LessonCategory.sendKeys(CourseCategory);
		NextBtn.click();
	}
}
