package demos.Scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import demos.Generic.BaseClass;
import demos.Generic.ExcelLib;
import demos.ObjRepo.CourseOnClick;
import demos.ObjRepo.CourseWizard;
import demos.ObjRepo.Modules;

@Listeners(demos.Generic.SampleListenr.class)
public class Testing extends BaseClass{
	@Test
	public void Scripting() throws Throwable
	{
		SoftAssert s=new SoftAssert();
		String Act=driver.findElement(By.xpath("//a[text()='Talentify']")).getText();
		String Exp="Talentify";
		s.assertEquals(Act,Exp);
		System.out.println("Logo verified --->>>"+s);
		s.assertAll();
		Reporter.log("Verify Logo", true);
		CourseOnClick cp=PageFactory.initElements(BaseClass.driver, CourseOnClick.class);;
		cp.CourseBtn();
		Reporter.log("Click on Course+ button", true);
		ExcelLib elib=new ExcelLib();
		String CourseName=elib.getExceldata("Sheet1", 1, 0);
		String CourseDescription=elib.getExceldata("Sheet1", 1, 1);
		String CourseCategory=elib.getExceldata("Sheet1", 1, 2);
		CourseWizard cw=PageFactory.initElements(BaseClass.driver, CourseWizard.class);
		cw.Create_NewCourse(CourseName, CourseDescription, CourseCategory);
		Modules md=PageFactory.initElements(BaseClass.driver, Modules.class);
		md.LessonModule();
		Reporter.log("Fetch the data from excelsheet", true);
		
	}
	

}
