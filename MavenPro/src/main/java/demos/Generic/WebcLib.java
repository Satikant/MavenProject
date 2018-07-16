package demos.Generic;

import java.util.concurrent.TimeUnit;

public class WebcLib {
	public void PageToLoad()
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
