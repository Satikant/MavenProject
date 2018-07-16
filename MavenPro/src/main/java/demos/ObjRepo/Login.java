package demos.ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import demos.Generic.BaseClass;
import demos.Generic.Constants;

public class Login {
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement Username;
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
    @FindBy(xpath="//button[text()='Login']")
    private WebElement LoginBtn;

public void LoginToApp()
{
	BaseClass.driver.get(Constants.URL);
	Password.clear();
	Username.clear();
	Username.sendKeys(Constants.UserName);
	Password.sendKeys(Constants.Password);
	LoginBtn.click();
}


}
