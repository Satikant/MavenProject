package demos.ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	@FindBy(xpath="//span[@class='caret']")
	private WebElement dropdown;
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement ClickLogout;
	
	 public void LoggingOut()
	 {
		 dropdown.click();
		 ClickLogout.click();
	 }

}
