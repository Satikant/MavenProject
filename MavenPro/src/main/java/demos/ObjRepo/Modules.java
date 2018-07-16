package demos.ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Modules {
	@FindBy(xpath="//input[@id='addChildren']")
	private WebElement ModuleID;
	@FindBy(xpath="//a[text()='Finish']")
	private WebElement FinishBtn;
	 public void LessonModule()
	 {
		 ModuleID.sendKeys("100");
		 FinishBtn.click();
	 }

}
