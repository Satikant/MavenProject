package demos.ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseOnClick {
	@FindBy(xpath="//a[text()='Talentify']")
	private WebElement LogoVerify;
	
	@FindBy(xpath=".//*[@id='create_course']")
	private WebElement Cplus;
	
	public void CourseBtn()
	{
	    LogoVerify.getText();
		Cplus.click();
	}

}
